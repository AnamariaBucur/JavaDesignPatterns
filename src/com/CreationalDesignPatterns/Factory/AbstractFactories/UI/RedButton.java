package com.CreationalDesignPatterns.Factory.AbstractFactories.UI;

public class RedButton implements Button{
    @Override
    public String getColor() {
        return "RED";
    }
}
