package com.BehavioralDesignPatterns.ChainOfResponsibility.LoggingApp;

public abstract class Logger {

    //create a chain of loggers
    public final Logger nextLogger;
    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }
    public abstract void log(LoggerRequest request);
}
