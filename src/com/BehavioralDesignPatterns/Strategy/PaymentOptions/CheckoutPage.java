package com.BehavioralDesignPatterns.Strategy.PaymentOptions;

public class CheckoutPage {
    public void payForItems(PaymentMethod paymentMethod) {
        paymentMethod.pay();
    }
}
