package com.myfarmproject;

public class Animal {
    public String type;
    public Animal(String type) {
        this.type = type;
        // constructor that initializes the type of animal
        // prints the type of animal to the console
    }

    public void getType() {
        System.out.println("this animal is a " + type);
    }
}
