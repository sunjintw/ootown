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
     * the total price of the input products is 55.0
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
     * the total price of the input products is 55.0
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
        //you may need to change the constructor or something else to pass the test
        Mall mall = new Mall();

        Bill bill = mall.buildBill(products);

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
     * the total price of the input products is 55.0
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
        //you may need to change the constructor or something else to pass the test
        Mall mall = new Mall();

        Bill bill = mall.buildBill(products);

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

    /**
     * need to set the Discount to 0.5 during the testing
     * need to set the Reduction to 20 - 5 during the testing
     * the total price of the input products is 55.0
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
     *   Total: $22.5
     */
    @Test
    public void buildBillWithDiscountAndReduction() throws Exception {
        //you may need to change the constructor or something else to pass the test
        Mall mall = new Mall();

        Bill bill = mall.buildBill(products);

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
                "Total: $22.5");
    }

    /**
     * need to set the Discount to 0.5 for Toy during the testing
     * need to set the Reduction to 20 - 5 for Food during the testing
     * need to change the toString function for Bill class to contains the category
     * the total price of the input products is 55.0
     * the output string should be
     *   TOY, P1, $1.0
     *   FOOD, P2, $2.0
     *   TOY, P3, $3.0
     *   FOOD, P4, $4.0
     *   TOY, P5, $5.0
     *   FOOD, P6, $6.0
     *   TOY, P7, $7.0
     *   FOOD, P8, $8.0
     *   TOY, P9, $9.0
     *   FOOD, P10, $10.0
     *   Total: $37.5
     */
    @Test
    public void buildBillWithDifferentCategory() throws Exception {
        //you may need to change the constructor or something else to pass the test
        Mall mall = new Mall();
        products = new ArrayList<>();
        for (int i = 1; i<= 10; i++) {
            Category category = i % 2 == 0 ? Category.FOOD : Category.TOY;
            products.add(new Product("P"+i, i, category));
        }

        Bill bill = mall.buildBill(products);

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
                "Total: $37.5");
    }

}
