package com.halim.designpatterns.strategy;

public class CustomPayment implements PayStrategy {

    @Override
    public void pay() {
        System.out.println("Paiement personnalsé a été efféctué");
    }
}
