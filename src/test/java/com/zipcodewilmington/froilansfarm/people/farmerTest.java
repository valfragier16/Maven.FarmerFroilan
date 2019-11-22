package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class farmerTest {
    @Test
public void farmerTest() {
        Botanist farmer = new Farmer();
    Farmer Froilan = new Farmer();
    Assert.assertTrue(Froilan instanceof Person);
    Assert.assertTrue(farmer instanceof Botanist);
    Assert.assertTrue(Froilan instanceof Botanist);
    }


    @Test
    public void getNameTest() {
        String name = "Froilan";
        Farmer
    }


    @Test
    public void plantTest(){

    }

    @Test
    public void mountTest() {

    }


    @Test
    public void dismountTest(){

    }

    @Test
    public void getTractorTest(){
        Farmer farmer=new Farmer();
        Tractor tractor=new Tractor();
        farmer.setTractor(tractor);
        Tractor expect=tractor;
        Tractor actual=farmer.getTractor();
        Assert.assertEquals(expect,actual);
    }

}

