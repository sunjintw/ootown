package com.thoughtworks.ootown.Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by xyduan on 8/11/16.
 */
public class HouseManage {

    public static HashMap<String, Integer> registers = new HashMap();
    public static ArrayList houses = new ArrayList();

    public HouseManage(){}

    public HouseManage(Double houseSize){
        int newHouseNum = getNewHouseNum();
        new House(newHouseNum,houseSize);
        houses.add(newHouseNum);
    }

    private int getNewHouseNum(){ return houses.size() + 1; }

    public int getRegisterHouseNum(){
        ArrayList<Integer> registeredHouseNums = new ArrayList(registers.values());
        ArrayList<Integer> housesNums = houses;
        housesNums.removeAll(registeredHouseNums);
        return housesNums.size() > 0 ? housesNums.get(0) : 0;
    }

    public String register(Person person) {
        String personIdNum = person.getIdNum();
        boolean registerFlag = false;
        if(!registers.containsKey(personIdNum)){
            int registerHouseNum = getRegisterHouseNum();
            registers.put(personIdNum, registerHouseNum);
            registerFlag = true;
        }
        return registerInfo(registerFlag, person.getName(), registers.get(personIdNum));
    }

    private String registerInfo(boolean registerFlag, String name, int houseNum){
        if(houseNum > 0){
            if(registerFlag){
                return "Congratulations! Dear Mr/Miss " + name +
                        ", you have registered House " + houseNum + " Successfully.";
            }else {
                return "Failed! Sorry, Mr/Miss " + name +
                        ", you have already registered " + houseNum + " . Please have a check.";
            }
        }else{
            return "Sorry, Mr/Miss " + name + ". No houses available now.";
        }
    }

}
