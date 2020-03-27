package com.behavioralPatterns.Iterator.iterators;

import com.behavioralPatterns.Iterator.profile.Profile;

/**
 * Iterator - defines an interface for
 * accessing and traversing elements
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
