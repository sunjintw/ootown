package com.thoughtworks.ootown.Model;

import java.util.List;

/**
 * Created by jsun on 8/25/16.
 */
public class Bill {
    private List<Product> products;

    private float totalPrice;

    public Bill(List<Product> products, float totalPrice) {
        this.products = products;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Product product: products) {
            sb.append("name: " + product.getName() + ", price: " + product.getPrice());
            sb.append(System.lineSeparator());
        }
        sb.append("total price: " + totalPrice);
        return sb.toString();
    }
}
