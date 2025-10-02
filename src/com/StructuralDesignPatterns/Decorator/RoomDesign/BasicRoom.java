package com.StructuralDesignPatterns.Decorator.RoomDesign;

public class BasicRoom implements Room{
    @Override
    public void printFurniture() {
        System.out.println("Carpet");
    }
}
