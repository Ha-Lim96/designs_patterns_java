package com.halim.designpatterns.decorator;

public class Caramel extends BoissonDecorateur{

    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 2.0 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " Au caramel";
    }
}
