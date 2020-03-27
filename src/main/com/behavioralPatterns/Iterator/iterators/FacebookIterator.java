package com.behavioralPatterns.Iterator.iterators;

import com.behavioralPatterns.Iterator.profile.Profile;
import com.behavioralPatterns.Iterator.socialNetworks.Facebook;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Iterator - implements the Iterator interface
 * keeps track of current position in the traversal of aggregate
 */
public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String email;
    // current position in the traversal of aggregate
    private int currentPosition = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public FacebookIterator(Facebook facebook, String type, String email) {
        this.facebook = facebook;
        this.type = type;
        this.email = email;
    }

    private void lazyLoad() {
        if (emails.size() == 0) {
            List<String> profiles = facebook.requestProfileFriends(this.email, this.type);
            for (String profile: profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean hasNext() {
        lazyLoad();
        return currentPosition < emails.size();
    }

    @Override
    public Profile getNext() {
        if (!hasNext()) {
            return null;
        }

        String friendEmail = emails.get(currentPosition);
        Profile friendProfile = profiles.get(currentPosition);
        if (friendProfile == null) {
            friendProfile = facebook.requestProfile(friendEmail);
            profiles.set(currentPosition, friendProfile);
        }
        // increment current position in the traversal of aggregate
        currentPosition++;
        return friendProfile;
    }

    @Override
    public void reset() {
        currentPosition = 0;
    }
}
