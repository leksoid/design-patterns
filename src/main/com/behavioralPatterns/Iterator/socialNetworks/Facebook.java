package com.behavioralPatterns.Iterator.socialNetworks;

import com.behavioralPatterns.Iterator.iterators.FacebookIterator;
import com.behavioralPatterns.Iterator.iterators.ProfileIterator;
import com.behavioralPatterns.Iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Concrete Aggregate
 * implements the Iterator to return an instance of the proper ConcreteIterator
 */
public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        this.profiles = Objects.requireNonNullElseGet(cache, ArrayList::new);
    }

    public Profile requestProfile(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile "
                + profileEmail + " over network");
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriends(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("Facebook: Loading profile "
                + contactType + " list of " + profileEmail + " over the network");
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    public Profile findProfile(String profileEmail) {
        for (Profile profile: profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
}
