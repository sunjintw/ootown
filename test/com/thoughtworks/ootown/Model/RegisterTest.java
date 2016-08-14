package com.thoughtworks.ootown.Model;

import static org.junit.Assert.assertEquals;

/**
 * Created by yuchen on 8/11/16.
 */
public class RegisterTest {

        Register register = null;

        @org.junit.Before
        public void setUp() throws Exception {
            register = new Register();
        }

        @org.junit.Test
        public void getHouseNum() throws Exception {

            Person person = new Person("chenyu", 20);

            boolean new_person = register.register(person);
            boolean exist_person = register.register(person);
            boolean success = register.record.containsKey(person);

            assertEquals(success, true);
            assertEquals(new_person, true);
            assertEquals(exist_person, false);

        }

}
