package com.BehavioralDesignPatterns.Strategy.LoginOptions;

public class LoginPage {
    public void logInUser(Authenticator authenticator) {
        authenticator.logIn();
    }
}
