package com.thoughtworks.ootown.Model;

import java.util.*;

/**
 * Created by jyang on 8/11/16.
 */

public class Register {
    private List houses = new ArrayList<House>();
    private HashMap<String, House> registers = new HashMap<String, House>();

    public Register(List houses) {
        this.houses = houses;
    }


    public int signUp(String person) {
        House is_exists =  registers.get(person);
        House a_hourse = (House) getNotUsedHouse();
        if (is_exists == null && a_hourse != null) {
            registers.put(person, a_hourse);
            a_hourse.setIsUsed();
        }

        if(a_hourse == null) {
            return 0;
        }

        return a_hourse.getHouseNum();
    }

    public House getNotUsedHouse() {
        for(Object tmp:houses){
            House house = (House) tmp;
            if(!house.getIsUsed()) {
                return house;
            }
        }
        return null;
    }
}
