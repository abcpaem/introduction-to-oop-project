package com.techreturners.oop;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Hey I'm " + name + ", the " + color + " talking " + Parrot.class.getSimpleName() + ". I'm a genius, but guess who is smarter than me? The spelling bee!.");
    }
}