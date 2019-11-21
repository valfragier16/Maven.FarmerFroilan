package com.zipcodewilmington.froilansfarm.animal.farmanimals;

import com.zipcodewilmington.froilansfarm.farm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

public class TestHorse {

    @Test
    public void nullaryConstructor(){
        //given
        Boolean expected = false;

        //when
        Horse horse = new Horse();

        //then
        Assert.assertEquals(expected, horse.getHasBeenRiddenToday());
    }

    @Test
    public void makeNoiseTest(){
        //given
        String expectedNoise = "Neigh!";

        //when
        Horse horse = new Horse();
        String actual = horse.makeNoise();

        //then
        Assert.assertEquals(expectedNoise, actual);
    }

    @Test
    public void rideTest(){
        //given
        Boolean expected = true;
        Farmer farmer = new Farmer();

        //when
        Horse horse = new Horse();
        horse.ride(farmer);

        //then
        Assert.assertEquals(expected, horse.getHasBeenRiddenToday());
    }

    @Test
    public void foodEatenTest(){
        //given
        Horse horse = new Horse();
        Integer expected = 1;

        //when
        horse.eat(new EarCorn());
        Integer actual = horse.getAmountofFood();

        //then
        Assert.assertEquals(expected, actual);
    }
}
