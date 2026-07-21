package com.school.access;

public class TestProduct {
    public static void main(String[]args){
        Product laptap = new Product();
        System.out.println("Product: " + laptap.productName);
        System.out.println("Price: " + laptap.price);
        System.out.println("Stock: " + laptap.stock);
        System.out.println("Info: " + laptap.getInfo());
    }
}
