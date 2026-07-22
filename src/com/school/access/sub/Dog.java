package com.school.access.sub;
import com.school.access.Animal;

public class Dog extends Animal {

    public Dog() {
        this.species = "Dog";
        this.legs = 4;
    }

    public String bark() {
        return "Woof! I am a " + species;
    }

    @Override
    public String describe() {
        return super.describe();
    }
}