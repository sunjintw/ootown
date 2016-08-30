package com.thoughtworks.ootown.Model;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jsun on 8/30/16.
 */
public class Bill {
    private float totalPrice;
    private List<Product> products;

    public Bill(float totalPrice, List<Product> products) {
        this.totalPrice = totalPrice;
        this.products = products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return products.stream().map(product -> product.getName() + ", $" + product.getPrice()).collect(Collectors.joining("\n")) + "\n" + "Total: $" + totalPrice;
    }
}
