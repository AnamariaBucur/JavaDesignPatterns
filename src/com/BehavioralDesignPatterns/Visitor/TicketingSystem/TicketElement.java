package com.BehavioralDesignPatterns.Visitor.TicketingSystem;

public interface TicketElement {
    int getPrice();

    void accept(Visitor visitor);

}
