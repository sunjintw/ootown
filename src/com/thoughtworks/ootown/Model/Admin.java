package com.thoughtworks.ootown.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by xifzhang on 11/08/16.
 */
public class Admin {
    private List<House> houseList = new ArrayList<House>();
    private HashMap registerMap = new HashMap();

    private Integer getHouseCount() {
        return houseList.size();
    }

    private boolean hasEmptyHouse() {
        return this.getHouseCount() > 0;
    }

    private Integer provideHouse() {
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
        Integer houseNum = provideHouse();
        if(houseNum > 0) {
            registerMap.put(houseNum, person.getName());
            return "Successfully";
        }
        return "Failed";
    }

    public String getPersonName(Integer houseNum) {
        return (String)this.registerMap.get(houseNum);
    }
}
