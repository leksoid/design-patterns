package com.creationalPattterns.AbstractFactory;

public class AppConfiguration {
    private enum OSType {
        OSX, WINDOWS
    }

    private static OSType currentOS = OSType.OSX;

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        if (currentOS.equals(OSType.OSX)) {
            factory = new OSXFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
