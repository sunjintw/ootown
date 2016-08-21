package com.thoughtworks.ootown.Model;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by xyduan on 8/11/16.
 */
public class HouseManageTest {
    HouseManage manage1 = new HouseManage();

    HouseManage manage2 = new HouseManage();

    VillaDistrict villaDistrict = VillaDistrict.getUniqueInstance();

    @org.junit.Before
    public void setUp() throws Exception {

        villaDistrict.initVillas(100.00);
        villaDistrict.initVillas(100.00);
        villaDistrict.initVillas(200.00);
        villaDistrict.initVillas(120.00);
    }

    @org.junit.Test
    public void getNewHouseNum() throws Exception {
//        assertEquals(5, manage.getNewHouseNum());

        assertEquals(1, manage1.getRegisterHouseNum());

//        HouseManage.registers.put("a", 1);
//        HouseManage.registers.put("b", 2);
//        int houseNum = manage.getRegisterHouseNum();
//        assertEquals(3, houseNum);
//
//        HouseManage.registers.put("c", 3);
//        HouseManage.registers.put("d", 4);
//        int houseOverNum = manage.getRegisterHouseNum();
//        assertEquals(0, houseOverNum);

    }

    @org.junit.Test
    public void registerWithFirstTime() throws Exception {

        Person Danny = new Person("123", "Danny", 20);

        String firstRegisterInfo = manage1.register(Danny);
        assertEquals("Congratulations! Dear Mr/Miss Danny, you have registered House 1 Successfully.",
                     firstRegisterInfo);
    }

    @org.junit.Test
    public void registerWithAgain() throws Exception {
        registerWithFirstTime();
        Person Danny = new Person("123", "Danny", 20);

        String RegisterAgainInfo = manage2.register(Danny);

        assertEquals("Failed! Sorry, Mr/Miss Danny, you have already registered 1 . Please have a check.",
                RegisterAgainInfo);
    }

    @org.junit.Test
    public void registerWithNoHouseAvailable() throws Exception {
        registerWithFirstTime();

        Person Joy = new Person("234", "Joy", 20);
        manage2.register(Joy);

        Person Eric = new Person("456", "Eric", 20);
        manage2.register(Eric);


        Person Lucy = new Person("678", "Lucy", 20);
        manage2.register(Lucy);

        Person Jay = new Person("890", "Jay", 20);
        String noHouseInfo = manage1.register(Jay);

        assertEquals("Sorry, Mr/Miss Jay. No houses available now.", noHouseInfo);
    }

}