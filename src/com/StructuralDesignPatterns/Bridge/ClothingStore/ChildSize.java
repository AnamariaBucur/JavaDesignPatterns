package com.StructuralDesignPatterns.Bridge.ClothingStore;

public class ChildSize implements Size{
    @Override
    public void get() {
        System.out.println("Child");
    }
}
