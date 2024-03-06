package com.halim.designpatterns.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Boisson espresso = new Espresso();
        System.out.println("description : " + espresso.getDescription() + ", prix : " + espresso.cout());


        espresso = new Chocolat(espresso);
        System.out.println("description : " + espresso.getDescription() + ", prix : " + espresso.cout());


    }
}

