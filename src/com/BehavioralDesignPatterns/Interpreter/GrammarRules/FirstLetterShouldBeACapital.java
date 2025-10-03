package com.BehavioralDesignPatterns.Interpreter.GrammarRules;

public class FirstLetterShouldBeACapital implements Expression{
    @Override
    public String interpret(String context) {
        var firstLetter = context.substring(0, 1);
        return firstLetter.toUpperCase() + context.substring(1);
    }
}
