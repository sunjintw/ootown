package com.thoughtworks.ootown.Strategy;

/**
 * Created by xyduan on 8/20/16.
 */
public class CashRegister {
    private double originPrice;
    private IDiscount iDiscount;

    public CashRegister(IDiscount i, double price){
        iDiscount = i;
        originPrice = price;
    }

    public double getOriginPrice(){return originPrice;};
    public void setOriginPirce(double pirce){originPrice = pirce;};

    private double getAfterDiscountPrice(){
        return iDiscount.CaculatePrice(originPrice);
    }

    public void displaBill(){
        System.out.println("Total Price: " + getOriginPrice() + "\n" +
                            "After Discount Price: " + getAfterDiscountPrice());
    };
}
