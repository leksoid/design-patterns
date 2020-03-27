package com.behavioralPatterns.Iterator.socialNetworks;

import com.behavioralPatterns.Iterator.iterators.ProfileIterator;

/**
 * Aggregate - defines interface for creating an Iterator object
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
