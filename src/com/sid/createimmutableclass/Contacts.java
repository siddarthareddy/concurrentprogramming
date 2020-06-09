package com.sid.createimmutableclass;

public final class Contacts { //make class final to avoid risk to immutability with inheritance

    private final String name;//all fields are final and fields are also immutable(String)
    private final String mobile;

    public Contacts(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName(){
        return name;
    }

    public String getMobile(){
        return mobile;
    }
}