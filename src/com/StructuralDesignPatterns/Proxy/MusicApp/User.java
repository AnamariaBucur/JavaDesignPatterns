package com.StructuralDesignPatterns.Proxy.MusicApp;

public class User {
    private final String name;
    private final boolean isPremium;

    public User(String name, Boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }
    public Boolean isPremium() {
        return isPremium;
    }
}
