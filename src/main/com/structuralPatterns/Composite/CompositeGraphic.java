package com.structuralPatterns.Composite;

import java.util.ArrayList;

/** Composite */
public class CompositeGraphic implements Graphic {

    /**
     * stores child components
     */
    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    //Adds the graphic to composition
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    /**
     * defines behavior for components having children
     */
    @Override
    public void print() {
        for (Graphic graphic: childGraphics) {
            graphic.print(); // delegated the operation to Component interface
        }
    }
}
