package com.CreationalDesignPatterns.Factory.AbstractFactories.BykeTypes;

public interface BikeFactory {

    HandleBars createHandlebars();
    Pedals createPedals();
    Tire createTire();

}
