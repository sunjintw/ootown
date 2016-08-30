package com.thoughtworks.ootown.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jsun on 8/11/16.
 */
public class Register {

    List<String> houses;
    Map<String, String> registry;

    public Register(List<String> houses) {
        this.houses = houses;
        this.registry = new HashMap<>();
    }

    public String regist(String people){
        String house = "";
        if(null == registry.get(people)){
            if(houses.size() > 0 ){
                house = houses.get(0);
                houses.remove(0);
                registry.put(people, house);
            }
        }
        return house;
    }
}
