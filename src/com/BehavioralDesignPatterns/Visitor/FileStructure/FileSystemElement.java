package com.BehavioralDesignPatterns.Visitor.FileStructure;

public interface FileSystemElement {

    String getName();

    void accept(Visitor visitor);
}
