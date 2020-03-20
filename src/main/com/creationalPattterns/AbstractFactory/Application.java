package com.creationalPattterns.AbstractFactory;

/**
 * Client
 */
public class Application {

    private Button button;

    public Application(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }

}
