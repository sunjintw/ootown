package com.thoughtworks.ootown.Model;

import java.util.List;

/**
 * Created by jsun on 8/25/16.
 */
public class Market {

    public Bill getBill(List<Product> products) {
        float totalPrice = 0f;

        for (Product product:products) {
            totalPrice += product.getPrice();
        }

        return new Bill(products, totalPrice);
    }
}
