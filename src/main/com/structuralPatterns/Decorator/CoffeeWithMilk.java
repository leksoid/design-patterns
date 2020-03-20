package com.structuralPatterns.Decorator;

public class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee c) {
        super(c);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
