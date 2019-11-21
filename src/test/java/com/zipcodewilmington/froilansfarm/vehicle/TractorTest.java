package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.field.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TractorTest {
    Field field = new Field();
    @Before
    public void setUp(){
        CropRow row = new CropRow();
        row.add(new Crops());
        row.add(new Crops());
        row.add(new TomatoPlant());
        row.add(new CornStalk());

        Field fields = new Field();
        fields.add(row);

        field.add(row);

        CropDuster cropDuster = new CropDuster();
        cropDuster.fertilizeCrop(field.getCropRow());

    }

    @Test
    public void harvestTest(){
        Tractor tractor = new Tractor();
        ArrayList<Crops> fertilizedCrops;
        fertilizedCrops = tractor.harvest(field);

        Assert.assertNotNull(fertilizedCrops);

    }
}
