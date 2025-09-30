package com.StructuralDesignPatterns.Adapter.Greetings;

public class FrenchMessageAdapter extends FrenchLocalizedMessage implements LocalizedMessage{
    private final FrenchLocalizedMessage frenchLocalizedMessage;
    public FrenchMessageAdapter() {
        frenchLocalizedMessage = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalizedMessage.sayBonjour();
    }
}
