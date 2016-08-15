package com.thoughtworks.ootown.Model;

import java.util.List;

/**
 * Created by xifzhang on 15/08/16.
 */
public class SafeList {
    private List<House> houseList;

    public SafeList(List<House> houseList) {
        this.houseList = houseList;
    }

    public void add(House house) {
        synchronized (this) {
            this.houseList.add(house);
        }
    }

    public House remove(int index) {
        House house = null;
        synchronized (this) {
           house = houseList.remove(index);
        }
        return house;
    }

    public int size() {
        return houseList.size();
    }
}
