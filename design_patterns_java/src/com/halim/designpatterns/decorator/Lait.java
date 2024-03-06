package com.halim.designpatterns.decorator;

public class Lait extends BoissonDecorateur {

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " Au lait";
    }
}
