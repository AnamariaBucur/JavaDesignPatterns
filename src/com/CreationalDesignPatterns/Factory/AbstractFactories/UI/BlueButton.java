package com.CreationalDesignPatterns.Factory.AbstractFactories.UI;

public class BlueButton implements Button{

    @Override
    public String getColor() {
        return "BLUE";
    }
}
