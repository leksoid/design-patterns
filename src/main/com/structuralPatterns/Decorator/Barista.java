package com.structuralPatterns.Decorator;

public class Barista {
    public static void printCoffeeInfo(Coffee c) {
        System.out.println("Cost: " + c.getCost() + "; Ingredients: " + c.getIngredients());
    }

    public static void main (String[] args) {
        Coffee coffee = new SimpleCoffee();
        printCoffeeInfo(coffee);

        coffee = new CoffeeWithMilk(coffee);
        printCoffeeInfo(coffee);

        coffee = new CoffeeWithSprinkles(coffee);
        printCoffeeInfo(coffee);
    }
}
