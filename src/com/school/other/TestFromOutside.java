package com.school.other;
import com.school.access.Person;

public class TestFromOutside {
    public static void main(String[]args){
        Person randomPerson = new Person();
        System.out.println("Name: " + randomPerson.name);
        System.out.println("Age: " + randomPerson.age);
        System.out.println(randomPerson.greet());
    }
}
