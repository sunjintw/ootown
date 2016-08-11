package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/6/16.
 */
public class House {
    private Integer houseNum;
    private Double size;

    public House(Integer houseNum, Double size) {
        this.houseNum = houseNum;
        this.size = size;
    }

    public Integer getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(Integer houseNum) {
        this.houseNum = houseNum;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
