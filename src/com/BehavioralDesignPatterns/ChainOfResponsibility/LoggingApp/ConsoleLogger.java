package com.BehavioralDesignPatterns.ChainOfResponsibility.LoggingApp;

public class ConsoleLogger extends Logger{
    public ConsoleLogger(Logger nextLogger) {
        super(nextLogger);  //call the constructor from the Logger class
    }
    @Override
    public void log(LoggerRequest request) {
        if (request.getLoggerType() == LoggerRequest.LoggerType.CONSOLE){
            System.out.println(request.getMessage());
        } else if (nextLogger != null) {
            nextLogger.log(request);
        }
    }
}
