package com.thoughtworks.ootown.Model;

import java.util.*;

/**
 * Created by yuchen on 8/11/16.
 */
public class Register {

    public HashMap<Person, String> record = new HashMap<>();
    public List<Person>  persons = new ArrayList<>();
    public List<String> houses = new ArrayList<>();

    public Register(){
        initPersons();
        initHouses();
    }

    private void initPersons() {
        persons.add(new Person("chenyu",27));
        persons.add(new Person("xin",27));
    }

    private void initHouses() {
        houses.add("Big House");
        houses.add("Middle House");
        houses.add("Small House");
    }

    public boolean register(Person person) {
        boolean has_house = check_has_house(person);
        if(has_house) {
            System.out.println(person.getName() + " have already get a house, Denied!");
            return false;
        } else {
            located_room(person);
            System.out.println(person.getName() +" have register a new house, house size is "+ record.get(person)) ;
            return true;
        }
    }

    private List<String> getAvailableRoom() {
        Collection<String> located_house = record.values();
        List<String> temp_houses = houses;
        temp_houses.removeAll(located_house);
        return temp_houses;
    }

    private void located_room(Person person){
        List<String> available_room = getAvailableRoom();
        int house_num = get_random_house_num(available_room.size());
        record.put(person, houses.get(house_num));
    }

    private boolean check_has_house(Person person) {
        for(Person tmp: record.keySet()) {
            if(tmp.samePerson(person)) {
                return true;
            }
        }
        return  false;

    }

    public boolean check_room_available(int wanted_count) {
        return houses.size() >= wanted_count;
    }

    private int get_random_house_num(int house_amount) {
        return (int)(Math.random()*house_amount);
    }

}
