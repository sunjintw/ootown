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
        boolean hasHouse = checkHasHouse(person);
        if(hasHouse) {
            System.out.println(person.getName() + " have already get a house, Denied!");
            return false;
        } else {
            locatedRoom(person);
            System.out.println(person.getName() +" have register a new house, house size is "+ record.get(person)) ;
            return true;
        }
    }

    public boolean checkRoomAvailable(int wantedCount) {
        return houses.size() >= wantedCount;
    }

    private List<String> getAvailableRoom() {
        Collection<String> located_house = record.values();
        List<String> availableHouses = houses;
        availableHouses.removeAll(located_house);
        return availableHouses;
    }

    private void locatedRoom(Person person){
        List<String> availableHouses = getAvailableRoom();
        int roomNum = getRandomHouseNum(availableHouses.size());
        record.put(person, houses.get(roomNum));
    }

    private boolean checkHasHouse(Person person) {
        for(Person p: record.keySet()) {
            if(p.isSamePerson(person)) {
                return true;
            }
        }
        return  false;

    }

    private int getRandomHouseNum(int house_amount) {
        return (int)(Math.random()*house_amount);
    }

}
