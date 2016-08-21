package com.thoughtworks.ootown.Model;

/**
 * Created by xyduan on 8/19/16.
 */
public class RegisterWebsite {
    HouseManage houseManage;

    public RegisterWebsite(HouseManage houseManage){
        houseManage = houseManage;
    }

    public String register(Person person){
       return houseManage.register(person);
    }

    public String remove(Person person){
        return houseManage.remove(person);
    }

}
