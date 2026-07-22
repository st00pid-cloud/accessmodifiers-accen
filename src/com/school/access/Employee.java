package com.school.access;

public class Employee {
    public String name = "Juan Dela Cruz";
    protected String department = "Engineering";
    String position = "Developer";
    private double salary = 75000.00;

    public void displayInfo(){
        System.out.println("=== Employee Info ===");
        System.out.println("[public]    Name:" + name );
        System.out.println("[protected] Department:" +  department);
        System.out.println("[default]   Position:" + position );
        System.out.println("[private]   Salary:" + salary );
    }

    public static void main(String[]args){
        Employee Juan = new Employee();
        Juan.displayInfo();
    }
}
