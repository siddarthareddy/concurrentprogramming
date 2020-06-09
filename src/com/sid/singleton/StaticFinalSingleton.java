package com.sid.singleton;

public class StaticFinalSingleton {
    //initialised during class loading

    /*
    Since Singleton instance is static and final variable
    it is initialized when class is first loaded into memory
    so creation of instance is inherently thread-safe.
     */
    private static final StaticFinalSingleton INSTANCE = new StaticFinalSingleton();

    //to prevent creating another instance of Singleton
    private StaticFinalSingleton(){}

    public static StaticFinalSingleton getSingleton(){
        return INSTANCE;
    }
}
