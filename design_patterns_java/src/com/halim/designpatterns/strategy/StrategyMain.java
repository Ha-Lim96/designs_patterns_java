package com.halim.designpatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new PayPalPayment());
        context.executePayment();

    }

}
