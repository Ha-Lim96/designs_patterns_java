package com.halim.designpatterns.singleton;

public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton() {
    }

    public static LazyInitializationSingleton getInstance() {
        if( instance == null ){
            instance = new LazyInitializationSingleton();
            System.out.println("Creating new instance of the class Lazy");
            return instance;
        }
        System.out.println("returning the instance of the class Lazy");
        return instance;
    }
}
