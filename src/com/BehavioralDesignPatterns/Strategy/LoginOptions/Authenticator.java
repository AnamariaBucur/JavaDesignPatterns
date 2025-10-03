package com.BehavioralDesignPatterns.Strategy.LoginOptions;

public interface Authenticator {
    void logIn();

    //static methods in Interfaces
    //implement lambda
    Authenticator passwordAuthenticator = () -> System.out.println("Logging in with username and password.");
    Authenticator singleSignOnAuthenticator = () -> System.out.println("Logging in with single sign-on.");
}
