package com.StructuralDesignPatterns.Facade.ClientMessage;

public class App {
    public static void main(String[] args) {
        var sendMessageFacade = new SendMessageFacade();
        sendMessageFacade.sendMessage();
    }
}
