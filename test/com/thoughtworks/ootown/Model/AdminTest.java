package com.thoughtworks.ootown.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by jsun on 8/6/16.
 */
public class AdminTest {
    Admin admin;
    List<House> houseList;
    @org.junit.Before
    public void setUp() throws Exception {
        houseList = new ArrayList<>();
        admin = new Admin(houseList);
    }

    @org.junit.Test
    public void shouldSuccessRegisterWhenThereAreEmtyptHouse() throws Exception {
        houseList.add(new House(1));
        Person person = new Person("xf", 18);

        String result = person.applyHouse(admin);

        String personName = admin.getPersonName(1);
        assertEquals("Successfully", result);
        assertEquals("xf", personName);
    }

    @org.junit.Test
    public void shouldFailedRegisterWhenThereIsNoEmptyHouse() throws Exception {
        houseList.add(new House(1));
        Person personA = new Person("cy", 28);
        Person personB = new Person("xf", 18);

        String resultA = personA.applyHouse(admin);
        String resultB = personB.applyHouse(admin);

        assertEquals("Successfully", resultA);
        assertEquals("Failed", resultB);
        assertEquals("cy", admin.getPersonName(1));
    }

    @org.junit.Test
    public void shouldFailedRegisterWhenThereIsNoHouse() throws Exception {
        Person person = new Person("xf", 18);

        String result = person.applyHouse(admin);

        assertEquals("Failed", result);
    }

    @org.junit.Test
    public void shouldSuccessUnRegisterWhenRegisteredPersonWantToCancel() throws Exception {
        houseList.add(new House(1));
        Person person = new Person("xf", 18);
        person.applyHouse(admin);

        String result = person.cancelHouse(admin);

        assertEquals("Successfully", result);
    }
}