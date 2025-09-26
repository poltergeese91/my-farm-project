package com.myfarmproject;

public class Cow extends super(Animal) {

    private int age;
    private String name;

    public Cow(int age, String name) {
        super("Cow");
        this.age = age;
        this.name = name;
    }

    public void moo() {
        System.out.println("The name of the animal is " + name);
    }
}
