package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/6/16.
 */
public class House {
    private Integer houseNum;
    private Integer size;
    private Boolean isUsed;

    public House(Integer houseNum, Integer size) {
        this.houseNum = houseNum;
        this.size = size;
        this.isUsed = false;
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

    public void setIsUsed() {
        this.isUsed = true;
    }

    public Boolean getIsUsed() {
        return this.isUsed;
    }

    @Override
    public String toString() {
        return "houseNum = " + houseNum + "size =" +size;
    }
}
