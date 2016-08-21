package com.thoughtworks.ootown.Strategy;

import static org.junit.Assert.*;

/**
 * Created by xyduan on 8/20/16.
 */
public class CashRegisterTest {

    @org.junit.Before
    public void setUp(){

    }

    @org.junit.Test
    public void BuyAndReducePrice() throws Exception{
        IDiscount iDiscount = new BuyAndReduce();
        double price = 100.00;
        CashRegister cash = new CashRegister(iDiscount,price);
        cash.displaBill();
    }

    @org.junit.Test
    public void ReturnCreditPrice() throws Exception{
        IDiscount iDiscount = new ReturnCredit();
        double price = 100.00;
        CashRegister cash = new CashRegister(iDiscount,price);
        cash.displaBill();
    }

    @org.junit.Test
    public void DirectDiscountPrice() throws Exception{
        IDiscount iDiscount = new DirectoryDiscount();
        double price = 100.00;
        CashRegister cash = new CashRegister(iDiscount,price);
        cash.displaBill();
    }

}