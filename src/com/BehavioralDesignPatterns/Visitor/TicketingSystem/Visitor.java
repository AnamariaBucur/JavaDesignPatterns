package com.BehavioralDesignPatterns.Visitor.TicketingSystem;

public interface Visitor {
    void visit(AdultTicket ticket);
    void visit(GroupTicket ticket);
}
