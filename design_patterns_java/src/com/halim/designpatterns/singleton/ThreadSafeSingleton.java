package com.halim.designpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null) {
            instance = new ThreadSafeSingleton();
            System.out.println("Thread Safe new instance");
            return instance;
        }

        System.out.println("returning Thread Safe instance");
        return instance;
    }

    public static ThreadSafeSingleton getDoubleCheckThreadSafeInstance(){
        if(instance == null) {
            synchronized (ThreadSafeSingleton.class){
                if(instance == null) {
                    instance = new ThreadSafeSingleton();
                    System.out.println("Thread Safe double check new instance");
                }
            }
            return instance;
        }
        System.out.println("returning Thread Safe double check instance");
        return instance;
    }

}
