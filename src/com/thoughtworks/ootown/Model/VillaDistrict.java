package com.thoughtworks.ootown.Model;

import java.util.ArrayList;

/**
 * Created by xyduan on 8/19/16.
 */
public class VillaDistrict {

    private static VillaDistrict uniqueInstance = new VillaDistrict();

    private static ArrayList<House> villas = new ArrayList();

    private VillaDistrict() {}

    public int initVillas(Double houseSize){
        int newHouseNum = getNewHouseNum();
        House house = new House(newHouseNum,houseSize);
        villas.add(house);
        return newHouseNum;
    }
//
    private int getNewHouseNum(){ return villas.size() + 1; }
//
    private ArrayList getVillas(){
        return villas;
    }

    public ArrayList getHousesNum(){
        ArrayList<House> villas = getVillas();
        ArrayList<Integer> houseNums = new ArrayList();
        for (House house:villas){
            houseNums.add(house.getHouseNum());
        }
        return houseNums;
    }

    public static VillaDistrict getUniqueInstance() {
        return uniqueInstance;
    }

    /** Singleton with synchronized
     * private static VillaDistrict uniqueInstance;
    public static synchronized VillaDistrict getUniqueInstance(){
     if(uniqueInstance == null){
     uniqueInstance = new VillaDistrict();
     }
     return uniqueInstance;
     }
     */



    /** Singleton with valiate
     * private volatile static VillaDistrict uniqueInstance;
     public static VillaDistrict getInstance(){
         if(uniqueInstance == null){
             synchronized (VillaDistrict.class){
                 if(uniqueInstance == null){
                    uniqueInstance = new VillaDistrict();
                }
            }
        }
     }
     */


}
