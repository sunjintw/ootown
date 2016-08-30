package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/30/16.
 */
public class Product {
    private String name;
    private float price;
    private Category category;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, float price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
