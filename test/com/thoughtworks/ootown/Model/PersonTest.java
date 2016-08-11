package com.thoughtworks.ootown.Model;

import static org.junit.Assert.*;

/**
 * Created by jsun on 8/6/16.
 */
public class PersonTest {
    Person person = null;

    @org.junit.Before
    public void setUp() throws Exception {
        person = new Person("Sicong Wang", 27);
    }

    @org.junit.Test
    public void getHouseNum() throws Exception {
        assertEquals("Sicong Wang", person.getName());
    }

}