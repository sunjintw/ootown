package com.thoughtworks.ootown.Strategy;

/**
 * Created by xyduan on 8/20/16.
 */
public class ReturnCredit implements IDiscount{

    public double CaculatePrice(double price) {
        int iPrice = (int) price;
        return iPrice - (iPrice/100) * 10;
    }

}
