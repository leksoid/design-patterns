package com.structuralPatterns.Composite;

/** Client */
public class CompositeDemo {
    public static void main (String[] args) {
        // initialize 4 ellipses
        Ellipse e1 = new Ellipse();
        Ellipse e2 = new Ellipse();
        Ellipse e3 = new Ellipse();
        Ellipse e4 = new Ellipse();

        // creates 2 composites
        CompositeGraphic graphic1 = new CompositeGraphic();
        // aggregation of many
        graphic1.add(e1);
        graphic1.add(e2);
        graphic1.add(e3);

        CompositeGraphic graphic2 = new CompositeGraphic();
        graphic2.add(e4);

        // Create composite graphic with 2 composites

        CompositeGraphic compositeGraphic = new CompositeGraphic();
        compositeGraphic.add(graphic1);
        compositeGraphic.add(graphic2);

        // prints complete graphic

        compositeGraphic.print();
    }
}
