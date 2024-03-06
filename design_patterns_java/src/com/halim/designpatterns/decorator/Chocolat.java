package com.halim.designpatterns.decorator;

public class Chocolat extends BoissonDecorateur{


    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3.5+ boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " Au chocolat.";
    }
}
