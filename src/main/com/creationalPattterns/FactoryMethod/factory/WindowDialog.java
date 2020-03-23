package com.creationalPattterns.FactoryMethod.factory;

import com.creationalPattterns.FactoryMethod.buttons.Button;
import com.creationalPattterns.FactoryMethod.buttons.WindowsButton;

public class WindowDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
