package com.thoughtworks.ootown.Model;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdminTest {
    Admin admin;
    List<House> houseList;
    @org.junit.Before
    public void setUp() throws Exception {
        houseList = new ArrayList<House>();
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

    @org.junit.Test
    public void shouldWorkFineWhenThereAreTwoAdminsToRegisterTheSameHouses() throws Exception {
        for(int i = 0;i < 300;i++) {
            houseList.add(new House(i));
        }
        final Admin admin1 = new Admin(houseList);
        final Admin admin2 = new Admin(houseList);
        final Person[] group1 = new Person[300];
        final Person[] group2 = new Person[300];
        final Person[] group3 = new Person[300];
        for(int j = 0;j < 300;j++) {
            group1[j] = new Person("xf" + j+1, j+1);
            group2[j] = new Person("amanda" + j+1, j+1);
            group3[j] = new Person("jason" + j+1, j+1);

        }
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for (Person person : group1) {
                    person.applyHouse(admin1);
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for (Person person : group2) {
                    person.applyHouse(admin2);
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        assertEquals(0, houseList.size());
    }
}