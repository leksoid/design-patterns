package com.creationalPattterns.FactoryMethod;

import com.creationalPattterns.FactoryMethod.factory.Dialog;
import com.creationalPattterns.FactoryMethod.factory.HtmlDialog;
import com.creationalPattterns.FactoryMethod.factory.WindowDialog;

public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen on configuration or
     * environment options
     */
    private static void configure() {
        dialog = System.getProperty("os.name").equals("Window 10")
                ? new WindowDialog() : new HtmlDialog();
    }

    /**
     * All of the client code should work with factories and products
     * through abstract interfaces.
     */
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
