package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.field.*;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
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

    @Test
    public void TractorTest() {
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Tractor);
        Assert.assertTrue(tractor instanceof FarmVehicle);
        Assert.assertTrue(tractor instanceof NoiseMaker);
        Assert.assertTrue(tractor instanceof Rideable);
    }

    @Test
    public void makeNoiseTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue("rrrrrrrrrrrr", tractor.makeNoise());
    }

    @Test
    public Tractor RideTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor.ride((Rider) tractor));
    }



}
