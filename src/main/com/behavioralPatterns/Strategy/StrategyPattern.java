package com.behavioralPatterns.Strategy;

public class StrategyPattern {
    public static void main (String[] args) {
        // Prepare strategies
        BillingStrategy normalStrategy = BillingStrategy.normalStrategy();
        BillingStrategy happyHourStrategy = BillingStrategy.happyHourStrategy();

        Customer firstCustomer = new Customer(normalStrategy);

        firstCustomer.add(100, 1);

        // Start happy hour

        firstCustomer.setStrategy(happyHourStrategy);
        firstCustomer.add(100, 2);

        // New customer
        Customer secondCustomer = new Customer(happyHourStrategy);
        secondCustomer.add(80,1);

        firstCustomer.printBill();

        // End Happy hour

        secondCustomer.setStrategy(normalStrategy);
        secondCustomer.add(130, 2);
        secondCustomer.add(250, 1);

        secondCustomer.printBill();


    }
}
