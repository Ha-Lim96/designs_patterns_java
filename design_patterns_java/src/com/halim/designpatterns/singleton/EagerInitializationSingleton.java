package com.halim.designpatterns.singleton;

public class EagerInitializationSingleton {

    public static final EagerInitializationSingleton instance = new EagerInitializationSingleton();;

    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getInstance(){
        System.out.println("Eager init of the class");
        return instance;
    }

}
