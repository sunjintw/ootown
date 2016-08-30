package com.thoughtworks.ootown.Model;

import java.util.List;

/**
 * Created by jsun on 8/30/16.
 */
public class Mall {
    public Bill buildBill(List<Product> products) {
        if(null != products && products.size() > 0) {
            float totalPrice = (float) products.stream().
                mapToDouble(
                    product -> product.getPrice()
                ).sum();
            return new Bill(totalPrice, products);
        }
        return null;
    }
}
