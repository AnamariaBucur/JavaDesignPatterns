package com.BehavioralDesignPatterns.TemplateMethod.PizzaRecipes;

public class VegetarianPizza extends Pizza {

    @Override
    public void addToppings() {
        System.out.println("Add cheese, tomato, mushrooms, peppers and olives" );
    }
}
