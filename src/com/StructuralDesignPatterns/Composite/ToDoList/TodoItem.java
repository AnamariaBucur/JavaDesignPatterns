package com.StructuralDesignPatterns.Composite.ToDoList;

public class TodoItem implements Completable{
    private final String description;
    private boolean completed = false;

    public TodoItem(String description) {
        this.description = description;
    }

    public void complete() {
        completed = true;
    }

    @Override
    public void isCompleted() {
        System.out.println("To do item \"" + description + "\" is completed " + completed);
    }
}
