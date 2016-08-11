package com.thoughtworks.ootown.Model;

/**
 * Created by jsun on 8/6/16.
 */
public class Person {

    private String idNum;
    private String name;
    private Integer age;

    public Person(String idNum, String name, Integer age) {
        this.idNum = idNum;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNum() {
        return idNum;
    }

}
