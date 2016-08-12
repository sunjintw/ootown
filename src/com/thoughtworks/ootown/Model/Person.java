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

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean samePerson(Person personB){
        return this.getName().equals(personB.getName()) && this.getAge() == personB.getAge();
    }

}
