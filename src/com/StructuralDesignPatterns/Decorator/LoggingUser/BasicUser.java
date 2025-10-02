package com.StructuralDesignPatterns.Decorator.LoggingUser;

public class BasicUser implements User{
    @Override
    public void printPrivileges() {
        System.out.println("Can log in");
    }
}
