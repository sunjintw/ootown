package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/25/16.
 */
public class Product {
    private int num;
    private String name;
    private float price;

    public Product(int num, String name, float price) {
        this.num = num;
        this.name = name;
        this.price = price;
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
