package CreationalDesignPatterns.Prototype.PizzaOrder;

import java.util.List;

public class OrderTracker {
    public static void main(String[] args) {
        PizzaFlavor hawaiian = new PizzaFlavor("Hawaiian");
        Pizza hawaiianPizza1 = new Pizza(4,hawaiian);
        Pizza hawaiianPizza2 = hawaiianPizza1.clone();
        Pizza hawaiianPizza3 = hawaiianPizza1.clone();
        Pizza hawaiianPizza4 = hawaiianPizza1.clone();
        Pizza hawaiianPizza5 = hawaiianPizza1.clone();

        hawaiian.setName("Hawaiian with extra cheese");

        PizzaFlavor peperoni = new PizzaFlavor("Peperoni");
        Pizza peperoniPizza1 = new Pizza(5,peperoni);
        Pizza peperoniPizza2 = peperoniPizza1.clone();
        Pizza peperoniPizza3 = peperoniPizza1.clone();
        Pizza peperoniPizza4 = peperoniPizza1.clone();
        Pizza peperoniPizza5 = peperoniPizza1.clone();

        List<Meal> order = List.of(hawaiianPizza1,hawaiianPizza2, hawaiianPizza3, hawaiianPizza4,hawaiianPizza5,peperoniPizza1,peperoniPizza2,peperoniPizza3,peperoniPizza4, peperoniPizza5);

        placeOrder(order);
    }
    private static void placeOrder(List<Meal>meals) {
        System.out.println("Order placed: ");
        meals.forEach(System.out::println);
    }
}
