package com.creationalPattterns.AbstractFactory;


public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is Windows Button");
    }
}
