package com.school.access.sub;

import com.school.access.Product;

public class TestDifferentPackage {
    public static void main(String[]args){
        //Product laptap = new Product();
        //System.out.println("Product: " + laptap.productName);
        //System.out.println("Price: " + laptap.price);
        //System.out.println("Stock: " + laptap.stock);
        //System.out.println("Info: " + laptap.getInfo());
        // error >> all four output: java: productName is not public in com.school.access.Product; cannot be accessed from outside package, starting from productName.

        //error-message here:

        System.out.println("--- Testing default access from a different package ---");
        System.out.println("Cannot access default members from outside the package.");
        System.out.println("Default (package-private) members are only visible within com.school.access.");
    }
}
