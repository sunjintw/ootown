package com.thoughtworks.ootown.Model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jsun on 8/11/16.
 */
public class RegisterTest {
    Register register;

    @Before
    public void setUp() throws Exception {
        List<String> houses = new ArrayList<>();
        houses.add("houses1");
        houses.add("houses2");
        houses.add("houses3");
        register = new Register(houses);
    }

    @Test
    public void registWhenDontHasHouse() throws Exception {
        String house = register.regist("zzz");
        assertNotEquals(house, "");
    }

    @Test
    public void registWhenHasHouse() throws Exception {
        String house = register.regist("zzz");
        assertNotEquals(house, "");
        String house2 = register.regist("zzz");
        assertEquals(house2, "");
    }

}