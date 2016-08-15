package com.thoughtworks.ootown.Model;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by jyang on 8/11/16.
 */

public class RegisterTest {
    Register register = null;

    @org.junit.Before
    public void setUp() throws Exception {
        List houses = new ArrayList<House>();
        houses.add(new House(1, 100));
        houses.add(new House(2, 200));
        houses.add(new House(3, 300));
        register = new Register(houses);
    }

    @org.junit.Test
    public void getFirstRoomWhenFirstPersonCome() throws Exception {
        int room_number_for_jing = register.signUp("Jing");
        assertEquals(1, room_number_for_jing);
    }
}
