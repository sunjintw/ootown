package com.thoughtworks.ootown.Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by xyduan on 8/11/16.
 */
public class HouseManage {

    public static HashMap<String, Integer> registers = new HashMap();
    public VillaDistrict villas = VillaDistrict.getUniqueInstance();
    private final int emptyHouse = 0;

    public HouseManage(){}


    public int getRegisterHouseNum(){
        ArrayList<Integer> registeredHouseNums = new ArrayList(registers.values());
        ArrayList<Integer> housesNums = villas.getHousesNum();
        housesNums.removeAll(registeredHouseNums);
        return housesNums.size() > 0 ? housesNums.get(0) : emptyHouse;
    }

    private int getRegisteredHouseNum(String personIdNum){
        return registers.get(personIdNum);
    }

    private boolean isRegisted(String personIdNum){
        return registers.containsKey(personIdNum);
    }

    public String register(Person person) {
        String personIdNum = person.getIdNum();
        boolean registerFlag = false;
        if(!isRegisted(personIdNum)){
            registers.put(personIdNum, getRegisterHouseNum());
            registerFlag = true;
        }
        return registerInfo(registerFlag, person.getName(), getRegisteredHouseNum(personIdNum));
    }

    public String remove(Person person) {
        String personIdNum = person.getIdNum();
        boolean removeFlag = false;
        int houseNum = emptyHouse;
        if(isRegisted(personIdNum)){
            houseNum = getRegisteredHouseNum(personIdNum);
            registers.remove(personIdNum);
            removeFlag = true;
        }
        return removeInfo(removeFlag, person.getName(), houseNum);

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

    private String removeInfo(boolean removeFlag, String name, int houseNum){
        if(removeFlag){
            if(houseNum == 0){
                return "Dear Mr/Miss " + name + ", you have cancel Register Successfully.";
            }else{
                return "Dear Mr/Miss " + name + ", you have cancel House " + houseNum + "Successfully.";
            }

        }else{
            return "Failed! Sorry, Mr/Miss " + name + "you have not registered";
        }
    }

}
