package com.halim.designpatterns.strategy;

public class PayPalPayment implements PayStrategy {
    @Override
    public void pay() {
        System.out.println("Paiement PayPal effectué avec succes ");
    }
}
