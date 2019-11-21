package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

    @Test
    public void constructorTest(){
        //given
        Integer expected = 0;

        //when
        FarmHouse farmHouse = new FarmHouse();
        Integer actual = farmHouse.getCount();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addTest(){
        //given
        String expected = "chung";
        Person person = new Person();
        person.setName(expected);

        //when
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(person);
        String actual = farmHouse.retrieveAtIndex(0).getName();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCountTest(){
        //given
        Integer expected = 3;
        FarmHouse farmHouse = new FarmHouse();

        //when
        for(int i = 0; i < expected; i++){
            farmHouse.add(new Person());
        }
        Integer actual = farmHouse.getCount();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPilotTest(){
        //given
        Pilot pilot = new Pilot();
        pilot.setName("chung");
        String expected = pilot.getName();
        Farmer farmer = new Farmer();
        farmer.setName("val");

        //when
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(farmer);
        farmHouse.add(pilot);
        String actual = farmHouse.getPilotFromFarm().getName();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getFarmerTest(){
        //given
        Pilot pilot = new Pilot();
        pilot.setName("chung");
        Farmer farmer = new Farmer();
        farmer.setName("val");
        String expected = farmer.getName();

        //when
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(farmer);
        farmHouse.add(pilot);
        String actual = farmHouse.getFarmerFromFarm().getName();

        //then
        Assert.assertEquals(expected, actual);

    }
}
