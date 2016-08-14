package com.thoughtworks.ootown.Model;

import org.junit.Test;

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

    @Test
    public void samePerson() throws Exception {
        Person new_person = new Person("Sicong Wang", 27);

        boolean same_person = person.isSamePerson(new_person);

        assertTrue(same_person);
    }
    @Test
    public void notSamePerson() throws Exception {
        Person new_person = new Person("Sicong Wang", 17);

        boolean not_same = person.isSamePerson(new_person);

        assertFalse(not_same);
    }
}