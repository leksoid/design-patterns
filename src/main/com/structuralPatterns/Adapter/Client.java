package com.structuralPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);

        if (hole.fits(rPeg)) System.out.println("Round peg fits round hole");

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) System.out.println("SMall sq peg fits in the hole");
        if (!hole.fits(largeSqPegAdapter)) System.out.println("Large square peg does not fit hole");
    }




}
