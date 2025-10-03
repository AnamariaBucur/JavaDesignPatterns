package com.BehavioralDesignPatterns.TemplateMethod.SendingEmails;

public abstract class Email {
    public void sendGreeting() {
        System.out.println("Hello,");
    }

    public abstract void sendMessageBody();

    public void sendClosing() {
        System.out.println("Best regards, Sam");
    }

}
