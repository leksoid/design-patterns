package com.creationalPattterns.FactoryMethod.factory;

import com.creationalPattterns.FactoryMethod.buttons.Button;

/**
 * Base factory class
 */
public abstract class Dialog {
    public void renderWindow() {
        // other code

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Factory method
     * @return a product
     */
    public abstract Button createButton();
}
