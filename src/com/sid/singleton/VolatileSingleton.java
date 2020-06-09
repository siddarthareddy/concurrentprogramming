package com.sid.singleton;

/*
 * A journey to write double checked locking of Singleton class in Java.
 */

class VolatileSingleton {

    private volatile static VolatileSingleton _instance;

    private VolatileSingleton() {}// private prevents Singleton object instantiation from outside

    /*
     * 1st version: creates multiple instance if two thread access
     * this method simultaneously
     */

    public static VolatileSingleton getInstanceNoConcurrency() {
        if (_instance == null) {
            _instance = new VolatileSingleton();
        }
        return _instance;
    }

    /*
     * 2nd version : this definitely thread-safe and only
     * creates one instance of Singleton on concurrent environment
     * but unnecessarily expensive due to cost of synchronization
     * at every call, even after object is constructed
     * no two threads can access the instance simultaneously
     */

    public static synchronized VolatileSingleton getInstanceThreadSafe() {
        if (_instance == null) {
            _instance = new VolatileSingleton();
        }
        return _instance;
    }

    /*
     * 3rd version : An implementation of double checked locking of Singleton.
     * Intention is to minimize cost of synchronization and  improve performance,
     * by only locking critical section of code, the code which creates instance of Singleton class.
     * This is still broken, if we don't make _instance volatile, as another thread can
     * see a half initialized instance of Singleton.
     */

    public static VolatileSingleton getInstanceDC() {
        if (_instance == null) {                // Single Checked
            synchronized (VolatileSingleton.class) {
                if (_instance == null) {        // Double checked
                    _instance = new VolatileSingleton();
                }
            }
        }
        return _instance;
    }
}