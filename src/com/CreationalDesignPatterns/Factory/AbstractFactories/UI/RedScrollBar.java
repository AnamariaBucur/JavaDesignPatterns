package com.CreationalDesignPatterns.Factory.AbstractFactories.UI;

public class RedScrollBar implements ScrollBar{
    @Override
    public String getColor() {
        return "RED";
    }
}
