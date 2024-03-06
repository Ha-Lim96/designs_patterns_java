package com.halim.designpatterns.singleton;

public class StaticBlockInitializationSingleton {

    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton() {
    }

    static {
        try {
            instance = new StaticBlockInitializationSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static StaticBlockInitializationSingleton getInstance() {
        System.out.println("static block init of the class");
        return instance;
    }

}
