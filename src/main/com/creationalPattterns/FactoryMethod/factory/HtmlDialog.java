package com.creationalPattterns.FactoryMethod.factory;

import com.creationalPattterns.FactoryMethod.buttons.Button;
import com.creationalPattterns.FactoryMethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
