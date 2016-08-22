package com.thoughtworks.ootown.Strategy;

/**
 * Created by xyduan on 8/22/16.
 */
public class Goods {
    String name;
    Double price;

    public Goods(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Double getPrice(){
        return this.price;
    }
}
