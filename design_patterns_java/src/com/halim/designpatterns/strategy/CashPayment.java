package com.halim.designpatterns.strategy;

public class CashPayment implements PayStrategy{

    @Override
    public void pay() {
        System.out.println("Paiement cash éffectué avec succès");
    }
}
