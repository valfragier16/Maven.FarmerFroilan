package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.food.Crop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TomatoPlantTest {
    @Test
    public void constructor1(){
        //given
        Integer expected = 0;
        Boolean  checkfert = false;

        //when
        TomatoPlant tomatoPlant = new TomatoPlant();

        //then
        Assert.assertEquals(expected, tomatoPlant.getNumberOfTomatoes());
        Assert.assertFalse(checkfert);
    }
    @Test
    public void constructor2(){
        //given
        Integer expected = 1;

        //when
        TomatoPlant tomatoPlant = new TomatoPlant(true, 1);

        //then
        Assert.assertEquals(expected, tomatoPlant.getNumberOfTomatoes());

    }

    @Test
    public void setTomatoTest(){
        //given
        Integer expected = 4;

        //when
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setNumberOfTomatoes(expected);

        //then
        Assert.assertEquals(expected, tomatoPlant.getNumberOfTomatoes());
    }

    @Test
    public void yieldTest(){
        //given
        ArrayList<Crops> crop = new ArrayList<Crops>();
        Integer expected = 2;

        //when
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.setNumberOfTomatoes(2);
        tomatoPlant.setIsFertilized(true);
        crop.add(tomatoPlant.yield());
        crop.add(tomatoPlant.yield());

        //then
        Assert.assertEquals(expected, (Integer)crop.size());
    }

    @Test
    public void isfertilizeTest() {
        Assert.assertFalse(tomatoPlant.getIsFertilized());
        crops.getFertilized();
        Assert.assertTrue(crops.getIsFertilized());
        Assert.assertTrue(crops.getFruit().size() >= crops.getLowerBoundYield());
        Assert.assertTrue(crops.getFruit().size() <= crops.getUpperBoundYield());

}
