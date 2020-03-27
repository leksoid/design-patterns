package com.behavioralPatterns.Iterator.socialNetworks;

import com.behavioralPatterns.Iterator.iterators.LinkedInIterator;
import com.behavioralPatterns.Iterator.iterators.ProfileIterator;
import com.behavioralPatterns.Iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinkedIn implements SocialNetwork {
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache){
        this.contacts = Objects.requireNonNullElseGet(cache, ArrayList::new);
    }

    public Profile requestContactInfo(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile "
                + profileEmail + " over network");
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContacts(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Loading profile "
                + contactType + " list of " + profileEmail + " over the network");
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String email) {
        for (Profile profile: contacts) {
            if (profile.getEmail().equals(email)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
