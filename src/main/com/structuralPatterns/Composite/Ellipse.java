package com.structuralPatterns.Composite;

/** Leaf */
public class Ellipse implements Graphic {

    /**
     * defines behavior for primitive objects
     * in this case, prints the graphic
     */
    @Override
    public void print() {
        System.out.println("Printing Ellipse");
    }
}
