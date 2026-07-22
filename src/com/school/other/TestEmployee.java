package com.school.other;

import com.school.access.Employee;

public class TestEmployee {
    public static void main(String[]args){
        Employee emp = new Employee();
        System.out.println("=== Access Modifier Test from com.school.other ===\n");
        System.out.println("[public] emp.name: " + emp.name + "   --> ACCESSIBLE");
        System.out.println("[protected] emp.department          --> NOT ACCESSIBLE (not a subclass, different package)");
        System.out.println("[default] emp.position              --> NOT ACCESSIBLE (different package)");
        System.out.println("[private] emp.salary                --> NOT ACCESSIBLE (private to Employee class only)");
        System.out.println("[public] emp.displayInfo():\n");
        // System.out.println(emp.department);
        // System.out.println(emp.position);
        // System.out.println(emp.salary);
        emp.displayInfo();

        // commented lines cannot compile



    }
}
