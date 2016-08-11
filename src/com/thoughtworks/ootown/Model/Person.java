package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/6/16.
 */
public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String applyHouse(Admin admin) {
       return admin.register(this);
    }

}
