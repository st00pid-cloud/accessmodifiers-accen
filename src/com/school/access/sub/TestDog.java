package com.school.access.sub;

public class TestDog {
    public static void main(String[] args) {
        // Create Dog object
        Dog myDog = new Dog();

        // Call inherited describe() method and subclass bark() method
        System.out.println("Description: " + myDog.describe());
        System.out.println("Bark: " + myDog.bark());
    }
}