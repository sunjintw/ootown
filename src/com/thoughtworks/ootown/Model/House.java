package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/6/16.
 */
public class House {
    private Integer houseNum;
    private Integer size;

    public House(Integer houseNum) {
        this.houseNum = houseNum;
    }

    public Integer getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Integer houseNum) {
        this.houseNum = houseNum;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
