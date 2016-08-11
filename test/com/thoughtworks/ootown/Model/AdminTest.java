package com.thoughtworks.ootown.Model;

import static org.junit.Assert.*;

/**
 * Created by jsun on 8/6/16.
 */
public class AdminTest {
    Admin admin;

    @org.junit.Before
    public void setUp() throws Exception {
         admin = new Admin();
    }

    @org.junit.Test
    public void shouldSuccessRegisterWhenThereAreEmtyptHouse() throws Exception {
        admin.setHouse(new House(1));
        Person person = new Person("xf", 18);

        String result = person.applyHouse(admin);

        String personName = admin.getPersonName(1);
        assertEquals("Successfully", result);
        assertEquals("xf", personName);
    }

    @org.junit.Test
    public void shouldFailedRegisterWhenThereIsNoEmptyHouse() throws Exception {
        admin.setHouse(new House(1));
        Person personA = new Person("cy", 28);
        Person personB = new Person("xf", 18);

        String resultA = personA.applyHouse(admin);
        String resultB = personB.applyHouse(admin);

        assertEquals("Successfully", resultA);
        assertEquals("Failed", resultB);
        assertEquals("cy", admin.getPersonName(1));
    }
}