package com.halim.designpatterns.strategy;

public class CreditCardPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("Paiement CreditCard effectué avec succès");
    }
}
