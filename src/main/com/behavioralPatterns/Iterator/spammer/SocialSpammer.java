package com.behavioralPatterns.Iterator.spammer;

import com.behavioralPatterns.Iterator.iterators.ProfileIterator;
import com.behavioralPatterns.Iterator.profile.Profile;
import com.behavioralPatterns.Iterator.socialNetworks.SocialNetwork;

public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("Iterating over friends");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworker(String profileEmail, String message) {
        System.out.println("Iterating over coworkers");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    private void sendMessage(String email, String message) {
        System.out.println("Sent message to " + email + " Message is " + message);
    }
}
