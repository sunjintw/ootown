package com.thoughtworks.ootown.Strategy;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by xyduan on 8/20/16.
 */
public class CashRegisterTest {


    @org.junit.Before
    public void setUp(){

    }

    @org.junit.Test
    public void DirectDiscountPriceWithoutDiscount() throws Exception{
        Goods apple = new Goods("apple", 50.00);
        Goods orange = new Goods("orange", 50.00);
        ArrayList<Goods> goodsList = new ArrayList();
        goodsList.add(apple);
        goodsList.add(orange);
        CashRegister cash = new CashRegister(goodsList);

        IDiscount iDiscount = new DirectoryDiscount();
        cash.setiDiscount(iDiscount);
        cash.displayBill();
    }

    @org.junit.Test
    public void DirectDiscountPriceWithDiscount() throws Exception{
        Goods apple = new Goods("apple", 50.00);
        Goods orange = new Goods("orange", 50.00);
        ArrayList<Goods> goodsList = new ArrayList();
        goodsList.add(apple);
        goodsList.add(orange);
        CashRegister cash = new CashRegister(goodsList);

        IDiscount iDiscount = new DirectoryDiscount(0.30);
        cash.setiDiscount(iDiscount);
        cash.displayBill();
    }

    @org.junit.Test
    public void BuyAndReducePrice() throws Exception{

        Goods apple = new Goods("apple", 50.00);
        Goods orange = new Goods("orange", 50.00);
        ArrayList<Goods> goodsList = new ArrayList();
        goodsList.add(apple);
        goodsList.add(orange);
        CashRegister cash = new CashRegister(goodsList);

        IDiscount iDiscount = new BuyAndReduce();
        cash.setiDiscount(iDiscount);
        cash.displayBill();
    }

    @org.junit.Test
    public void ReturnCreditPrice() throws Exception{
        Goods apple = new Goods("apple", 50.00);
        Goods orange = new Goods("orange", 50.00);
        ArrayList<Goods> goodsList = new ArrayList();
        goodsList.add(apple);
        goodsList.add(orange);
        CashRegister cash = new CashRegister(goodsList);

        IDiscount iDiscount = new ReturnCredit();
        cash.setiDiscount(iDiscount);
        cash.displayBill();
    }



}