package com.behavioralPatterns.Strategy;

/**
 * Declares interface and implementation
 */
@FunctionalInterface
public interface BillingStrategy {
    int getPrice(int rawPrice);

    static BillingStrategy normalStrategy() {
        return rawPrice -> rawPrice;
    }

    static BillingStrategy happyHourStrategy() {
        return rawPrice -> rawPrice / 2;
    }
}
