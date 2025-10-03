package com.BehavioralDesignPatterns.Memento.UndoText;

public class TextDocumentState {
    private String state;

    public TextDocumentState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
