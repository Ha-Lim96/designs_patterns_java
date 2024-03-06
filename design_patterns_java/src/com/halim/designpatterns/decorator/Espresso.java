package com.halim.designpatterns.decorator;

public class Espresso extends Boisson{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 3.6;
    }


}
