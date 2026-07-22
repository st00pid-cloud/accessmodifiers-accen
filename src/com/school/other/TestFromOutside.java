package com.school.other;
import com.school.access.Animal;
import com.school.access.Person;
import com.school.access.sub.Dog;

public class TestFromOutside {
    public static void main(String[]args){
        Person randomPerson = new Person();
        System.out.println("Name: " + randomPerson.name);
        System.out.println("Age: " + randomPerson.age);
        System.out.println(randomPerson.greet());

        Animal myCat = new Animal();
        // System.out.println(myCat.species);
        // System.out.println(myCat.describe());

        // both results into this error: 'species' has protected access in 'com.school.access.Animal'
        // error 2: 'describe()' has protected access in 'com.school.access.Animal'

        System.out.println("\n--- Testing protected access from non-subclass in different package ---\n" +
                "Cannot access protected members from a non-subclass in a different package.");
    }
}



