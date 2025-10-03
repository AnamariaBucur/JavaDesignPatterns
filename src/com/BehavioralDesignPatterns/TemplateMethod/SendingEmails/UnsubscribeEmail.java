package com.BehavioralDesignPatterns.TemplateMethod.SendingEmails;

public class UnsubscribeEmail extends Email {

    @Override
    public void sendMessageBody() {
        System.out.println("We are sorry to see you go." );
    }

}