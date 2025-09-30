package com.StructuralDesignPatterns.Adapter.Greetings;

public class EnglishLocalizedMessage implements LocalizedMessage{
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
