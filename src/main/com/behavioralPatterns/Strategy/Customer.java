package com.behavioralPatterns.Strategy;

import java.util.ArrayList;
import java.util.List;

/** Context
 * configures with ConcreteStrategy object
 * maintains reference to Strategy
 */
public class Customer {
    private final List<Integer> drinks = new ArrayList<>();
    private BillingStrategy strategy;

    public Customer(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void add(int price, int quantity) {
        this.drinks.add(this.strategy.getPrice(price*quantity));
    }

    public void printBill() {
        int sum = this.drinks.stream().mapToInt(e -> e).sum();
        System.out.println("Total due: " + sum);
        this.drinks.clear();
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }
}
