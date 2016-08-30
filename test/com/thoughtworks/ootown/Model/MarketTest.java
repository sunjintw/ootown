package com.thoughtworks.ootown.Model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by jsun on 8/25/16.
 */
public class MarketTest {

    @Test
    public void testGetBill() {
        Market market = new Market();

        List<Product> products = new ArrayList<>();
        for (int i=1; i<5; i++) {
            products.add(new Product(i,"p" +i, i));
        }
        Bill bill = market.getBill(products);
        assertEquals(bill.toString(), "name: p1, price: 1.0\n" +
                "name: p2, price: 2.0\n" +
                "name: p3, price: 3.0\n" +
                "name: p4, price: 4.0\n" +
                "total price: 10.0");
    }

}