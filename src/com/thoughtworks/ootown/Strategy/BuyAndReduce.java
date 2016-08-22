package com.thoughtworks.ootown.Strategy;

/**
 * Created by xyduan on 8/20/16.
 */
public class BuyAndReduce implements IDiscount{
    private Double full;
    private Double reducation;

    private final Double Full = 100.00;
    private final Double Reducation = 50.00;

    public BuyAndReduce(){
        this.full = Full;
        this.reducation = Reducation;
    }

    public BuyAndReduce(double full, double reducation){
        this.full = full;
        this.reducation = reducation;
    }

    public double CaculatePrice(double price) {
        int iPrice = (int) price;
        return iPrice - (iPrice/this.full) * this.reducation;
    }
}
