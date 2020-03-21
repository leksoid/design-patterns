package com.structuralPatterns.Adapter;

import static java.lang.Math.*;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        // calculate minimum circle radius that fits
        return (sqrt(pow((peg.getWidth() / 2), 2) * 2));
    }
}
