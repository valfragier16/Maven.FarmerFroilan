package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;

import java.util.ArrayList;

public class FarmHouse {

    private ArrayList<Person> people;

    public FarmHouse(){
        this.people = new ArrayList<Person>();
    }


    public void add(Person person) {
        people.add(person);
    }

    public Person retrieveAtIndex(Integer index) {
        return this.people.get(index);
    }

    public Integer getCount() {
        return this.people.size();

    }

    public Pilot getPilotFromFarm() {
        Pilot retVal = null;
        Integer countOfPeopleInHouse = this.getCount();
        for (int i = 0; i < countOfPeopleInHouse; i++) {
            Person person = this.retrieveAtIndex(i);
            if (person instanceof Pilot) {
                retVal = (Pilot) person;
            }
        }
        return retVal;
    }

    public Farmer getFarmerFromFarm() {
        Farmer retVal = null;
        Integer countOfPeopleInHouse = this.getCount();
        for (int i = 0; i < countOfPeopleInHouse; i++) {
            Person person = this.retrieveAtIndex(i);
            if (person instanceof Farmer) {
                retVal = (Farmer) person;
            }
        }

        return retVal;
    }

}
