package com.CreationalDesignPatterns.Factory.AbstractFactories.BykeTypes;

public class MountainBikeFactory implements BikeFactory{
    @Override
    public HandleBars createHandlebars() {
        return new MountainBikeHandleBars();
    }

    @Override
    public Pedals createPedals() {
        return new MountainBikePedals();
    }

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }
}
