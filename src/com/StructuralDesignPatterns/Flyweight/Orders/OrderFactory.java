package com.StructuralDesignPatterns.Flyweight.Orders;

import java.util.HashMap;
import java.util.Map;

public class OrderFactory {
    private static final Map<String, Order> orderCache = new HashMap<>();
    public static Order createOrder(String name) {
        return orderCache.computeIfAbsent(name, Order::new);
    }
}
//computeIfAbsent means this:
//        if (orderCache.containsKey(name)) {
//            return orderCache.get(name);
//        }
//        var order = new Order(name);
//        orderCache.put(name, order);
//        return order;
