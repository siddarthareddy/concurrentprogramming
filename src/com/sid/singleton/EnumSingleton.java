package com.sid.singleton;

/*
By default creation of Enum instance is thread safe
but any other method on Enum is programmers responsibility.
 */

public enum EnumSingleton {
    INSTANCE;

    public void show(){
        System.out.println("Singleton using Enum in Java");
    }
    //Singleton.INSTANCE.show();
}

/*
You can access it by EasySingleton.INSTANCE,
much easier than calling getInstance() method on Singleton.
 */
/*
if you are using an instance method
then you need to ensure thread-safety of that method
if at all it affects the state of an object.
 */