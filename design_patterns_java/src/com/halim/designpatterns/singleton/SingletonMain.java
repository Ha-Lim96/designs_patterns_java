package com.halim.designpatterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        EagerInitializationSingleton.getInstance();
        StaticBlockInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();
        LazyInitializationSingleton.getInstance();

        for(int i = 0; i < 5; i++){
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getInstance();
            ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
            ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
            ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
            ThreadSafeSingleton.getDoubleCheckThreadSafeInstance();
        }

    }
}
