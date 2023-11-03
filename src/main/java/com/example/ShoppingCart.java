package com.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart { 
    private List<Product> products;
   //create a new arraylist

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double totalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}



// TODO: Implement methods to add a product, remove a product, and calculate the
// total cost

