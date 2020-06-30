package com.tabinc;

public abstract class Passenger {
    private String name;
    private int age;

    // Constructor
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String nameToSet){
        this.name = nameToSet;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(){
        this.age = age;
    }

    public double getDiscount(){
        return 0.0;
    }
}

