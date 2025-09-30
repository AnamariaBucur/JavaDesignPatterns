package com.CreationalDesignPatterns.Singleton.ex2;
/*
Refactor the Logger class, making it a Singleton
 */
public enum Logger {
    INSTANCE;

    //no need to create a constructor
    //for enums, loggers are private by default
    public static Logger getInstance() {
        return INSTANCE;
    }
    void log(String logMessage) {
        System.out.println(logMessage);
    }
}

