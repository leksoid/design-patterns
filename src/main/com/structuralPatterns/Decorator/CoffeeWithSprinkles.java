package com.structuralPatterns.Decorator;

public class CoffeeWithSprinkles extends CoffeeDecorator {
    public CoffeeWithSprinkles(Coffee c) {
        super(c);
    }

    public double getCost() {
        return super.getCost() + 1;
    }

    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }
}
