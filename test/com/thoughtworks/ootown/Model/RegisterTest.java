package com.thoughtworks.ootown.Model;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by jyang on 8/11/16.
 */

public class RegisterTest {
    Register register1 = null;
    Register register2 = null;

    @org.junit.Before
    public void setUp() throws Exception {
        List houses = new ArrayList<House>();
        houses.add(new House(1, 100));
        houses.add(new House(2, 200));
        houses.add(new House(3, 300));
        register1 = new Register(houses);

    }

    @org.junit.Test
    public void getFirstRoomWhenFirstPersonCome() throws Exception {
        int room_number_for_jing = register1.signUp("Jing");
        assertEquals(1, room_number_for_jing);
    }

    @org.junit.Test
    public void getNoRoomWhenFourthPersonCome() throws Exception {
        register1.signUp("First person");
        register1.signUp("Second person");
        register1.signUp("Third person");
        int room_number_for_jing = register1.signUp("Jing");
        assertEquals(0, room_number_for_jing);
    }

    @org.junit.Test
    public void multipleAdminsManageTheSameHouses() throws Exception {
        register2 = new Register();

        int room_number_for_first = register1.signUp("First person");
        assertEquals(1, room_number_for_first);

        int room_number_for_second = register2.signUp("Second person");
        assertEquals(2, room_number_for_second);

        int room_number_for_third = register1.signUp("Third person");
        assertEquals(3, room_number_for_third);

        int room_number_for_fourth = register2.signUp("Jing");
        assertEquals(0, room_number_for_fourth);
    }

    @org.junit.Test
    public void multipleAdminsManageDifferentHouses() throws Exception {
        register2 = new Register();

        int room_number_for_first = register2.signUp("First person");
        assertEquals(0, room_number_for_first);
    }
}
