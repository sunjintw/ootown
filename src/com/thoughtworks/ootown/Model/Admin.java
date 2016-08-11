package com.thoughtworks.ootown.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xifzhang on 11/08/16.
 */
public class Admin {
    private Integer houseNum;
    private List<House> houseList = new ArrayList<House>();
    private HashMap registerMap = new HashMap();

    private Integer getHouseNum() {
        return houseList.size();
    }

    private boolean hasEmptyHouse() {
        return this.getHouseNum() > 0;
    }

    private Integer getHouse() {
        if(hasEmptyHouse()) {
            House house = houseList.remove(0);
            return house.getHouseNum();
        }
        return -1;
    }

    public void setHouse(House house) {
        this.houseList.add(house);
    }

    public String register(Person person) {
        Integer houseNum = getHouse();
        if(houseNum > 0) {
            registerMap.put(houseNum, person.getName());
            return "Succssfully";
        }
        return "Failed";
    }

    public String getPersonName(Integer houseNum) {
        return (String)this.registerMap.get(houseNum);
    }
}
