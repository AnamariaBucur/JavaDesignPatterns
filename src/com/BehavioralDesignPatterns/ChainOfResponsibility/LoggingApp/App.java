package com.BehavioralDesignPatterns.ChainOfResponsibility.LoggingApp;

public class App {
    public static void main(String[] args) {
        var message = "Hello World";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.CONSOLE);
        Logger logger = buildChain();
        logger.log(request);
    }

    //build the chain in the desired order
    //start at the end of the chain
    //fileLogger will be the last one checked
    private static Logger buildChain() {
        var fileLogger = new FileLogger(null); //end of the chain
        var consoleLogger = new ConsoleLogger(fileLogger);
        return consoleLogger;
    }
}
