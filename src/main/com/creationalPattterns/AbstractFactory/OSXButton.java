package com.creationalPattterns.AbstractFactory;

public class OSXButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is OSX button");
    }
}
