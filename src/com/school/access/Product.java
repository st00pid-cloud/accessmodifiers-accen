package com.school.access;

public class Product {
    String productName = "Laptop";
    double price = 45999.00;
    int stock = 15;
    String getInfo() {
        return String.format(
                "Product: %s - Price: %.1f ( %d in stock)",
                productName, price, stock
        );
    }
}
