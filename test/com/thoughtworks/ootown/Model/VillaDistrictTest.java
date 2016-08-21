package com.thoughtworks.ootown.Model;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by xyduan on 8/19/16.
 */
public class VillaDistrictTest {
    VillaDistrict villaDistrict = VillaDistrict.getUniqueInstance();
    @org.junit.Before
    public void setUp(){

    }

    @org.junit.Test
    public void initvillas() throws Exception{
        int houseNum = villaDistrict.initVillas(100.0);
        assertEquals(1, houseNum);
    }

}