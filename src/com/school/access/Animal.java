package com.school.access;

public class Animal {
    protected String species = "Unknown";
    protected int legs = 4;

    protected String describe() {
        return species + " has " + legs + " legs";
    }
}