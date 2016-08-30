package com.thoughtworks.ootown.Model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jsun on 8/30/16.
 */
public class MallTest {

    List<Product> products;

    @Before
    public void setUp() throws Exception {
        products = new ArrayList<>();
        for (int i = 1; i<= 10; i++) {
            products.add(new Product("P"+i, i));
        }
    }

    /**
     * this is the basic test without any discount
     * the total price of the input products is 55f
     * the output string should be
     *   P1, $1.0
     *   P2, $2.0
     *   P3, $3.0
     *   P4, $4.0
     *   P5, $5.0
     *   P6, $6.0
     *   P7, $7.0
     *   P8, $8.0
     *   P9, $9.0
     *   P10, $10.0
     *   Total: $55.0
     *
     * Note: When you implement the other functionality,
     * you must make sure you don't break this function
     */
    @Test
    public void buildBillWithoutDiscount() throws Exception {
        Mall mall = new Mall();

        Bill bill = mall.buildBill(products);

        assertEquals(bill.getTotalPrice(), 55.0, 0.0f);
        assertEquals(bill.toString(), "P1, $1.0\n" +
                "P2, $2.0\n" +
                "P3, $3.0\n" +
                "P4, $4.0\n" +
                "P5, $5.0\n" +
                "P6, $6.0\n" +
                "P7, $7.0\n" +
                "P8, $8.0\n" +
                "P9, $9.0\n" +
                "P10, $10.0\n" +
                "Total: $55.0");

    }

    /**
     * need to set the Discount to 0.5 during the testing
     * the total price of the input products is 55f
     * the output string should be
     *   P1, $1.0
     *   P2, $2.0
     *   P3, $3.0
     *   P4, $4.0
     *   P5, $5.0
     *   P6, $6.0
     *   P7, $7.0
     *   P8, $8.0
     *   P9, $9.0
     *   P10, $10.0
     *   Total: $27.5
     */
    @Test
    public void buildBillWithHalfDiscount() throws Exception {
        //you may change the constructor or something else to pass the test
        Mall mall = new Mall();

        Bill bill = mall.buildBill(products);

        assertEquals(bill.getTotalPrice(), 27.5, 0.0f);
        assertEquals(bill.toString(), "P1, $1.0\n" +
                "P2, $2.0\n" +
                "P3, $3.0\n" +
                "P4, $4.0\n" +
                "P5, $5.0\n" +
                "P6, $6.0\n" +
                "P7, $7.0\n" +
                "P8, $8.0\n" +
                "P9, $9.0\n" +
                "P10, $10.0\n" +
                "Total: $27.5");
    }


    /**
     * need to set the Reduction to 20 - 5 during the testing
     * the total price of the input products is 55f
     * the output string should be
     *   P1, $1.0
     *   P2, $2.0
     *   P3, $3.0
     *   P4, $4.0
     *   P5, $5.0
     *   P6, $6.0
     *   P7, $7.0
     *   P8, $8.0
     *   P9, $9.0
     *   P10, $10.0
     *   Total: $45.0
     */
    @Test
    public void buildBillWithReduction() throws Exception {
        //you may change the constructor or something else to pass the test
        Mall mall = new Mall();

        Bill bill = mall.buildBill(products);

        assertEquals(bill.getTotalPrice(), 45.0, 0.0f);
        assertEquals(bill.toString(), "P1, $1.0\n" +
                "P2, $2.0\n" +
                "P3, $3.0\n" +
                "P4, $4.0\n" +
                "P5, $5.0\n" +
                "P6, $6.0\n" +
                "P7, $7.0\n" +
                "P8, $8.0\n" +
                "P9, $9.0\n" +
                "P10, $10.0\n" +
                "Total: $45.0");
    }
}
