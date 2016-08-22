package com.thoughtworks.ootown.Strategy;

import java.util.ArrayList;

/**
 * Created by xyduan on 8/20/16.
 */
public class CashRegister {
    private IDiscount iDiscount;
    private ArrayList<Goods> goodsList = new ArrayList();

    public CashRegister(ArrayList goodsList){
        this.goodsList = goodsList;
    }

    public void setiDiscount(IDiscount iDiscount){
        this.iDiscount = iDiscount;
    }

    private double getOriginTotalPrice(){
        double totalPrice = 0;
        for(Goods goods:goodsList ){
            totalPrice += goods.getPrice();
        }
        return totalPrice;
    };

    private double getAfterDiscountPrice(){
        return iDiscount.CaculatePrice(getOriginTotalPrice());
    }

    public void displayBill(){
        String bill = "-------------WELCOME----------\n";
        bill += "Name      Price\n";
        bill += "--------------------------------\n";
        for(Goods goods:goodsList){
            bill += goods.getName() + "      " + goods.getPrice();
            bill += "\n";
        }
        bill += "---------------------------------\n";
        bill += "Total Price: " + getOriginTotalPrice();
        bill += "\nAfter Discount Price: " + getAfterDiscountPrice();
        System.out.println(bill);
    };
}
