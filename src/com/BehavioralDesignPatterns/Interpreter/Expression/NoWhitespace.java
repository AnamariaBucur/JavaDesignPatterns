package com.BehavioralDesignPatterns.Interpreter.Expression;

public class NoWhitespace implements Expression{
    @Override
    public String interpret(String context) {
        return context.replaceAll(" ", "");
    }
}
