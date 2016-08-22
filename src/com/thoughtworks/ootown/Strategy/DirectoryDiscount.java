package com.thoughtworks.ootown.Strategy;

/**
 * Created by xyduan on 8/20/16.
 */
public class DirectoryDiscount implements IDiscount{
    private Double discount;
    private final Double payHalf = 0.50;

    public DirectoryDiscount(){
        this.discount = this.payHalf;
    }
    public DirectoryDiscount(double discount){
        this.discount = discount;
    }
    public double CaculatePrice(double price) {
        return price * this.discount;
    }
}
