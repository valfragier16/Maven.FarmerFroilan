package com.zipcodewilmington.froilansfarm.farm.field;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;
import java.util.List;

public class CropsTest {
    @Test
    public void constructorTest(){
        //given
        Integer expected = 1;
        ArrayList<Crops> croprow = new ArrayList<Crops>();


        //when
        croprow.add(new Crops());
        CropRow crops = new CropRow(croprow);
        Integer actual = crops.getNumberOfCrops();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCropListTest(){
        //given
        long expected = 0;
        List<Crops> tester;

        //when
        CropRow crop = new CropRow();
        tester = crop.getCropsList();

        //then
        Assert.assertEquals(expected, tester.size());
    }

    @Test
    public void addTest(){
        //given
        Integer expected = 1;
        Crops crops = new Crops();

        //when
        CropRow cropRow = new CropRow();
        cropRow.add(crops);

        //then
        Assert.assertEquals(expected, cropRow.getNumberOfCrops());
    }

    @Test
    public void removeTest(){
        //given
        Integer expected = 0;
        Crops crops = new Crops();
        Crops crops1 = new Crops();

        //when
        CropRow cropRow = new CropRow();
        cropRow.add(crops);
        cropRow.add(crops1);

        //removing crops;
        cropRow.removeAll();

        //then
        Assert.assertEquals(expected, cropRow.getNumberOfCrops());
    }
}
