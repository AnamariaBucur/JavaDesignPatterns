package com.CreationalDesignPatterns.Singleton.ex1;

//enums in Java are thread safe
public enum PrintSpooler {
    INSTANCE;
    private PrintSpooler() {}

    public static PrintSpooler getInstance(){
        return INSTANCE;
    }
    void print() {
        System.out.println("Printing...");
    }
}
