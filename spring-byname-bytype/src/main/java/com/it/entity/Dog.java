package com.it.entity;

public class Dog {
    String name;

    public Dog() {
        System.out.println("get a dog now");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void talk() {
        System.out.println("wang wang wang" );
    }
}