package com.halim.designpatterns.decorator;

public class Cafe extends Boisson{

    public Cafe() {
        description = "café";
    }

    @Override
    public double cout() {
        return 7.0;
    }

}
