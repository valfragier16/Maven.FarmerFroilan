package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.field.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {
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

    }

    @Test
    public void fertilizerTest(){
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilizeCrop(field.getCropRow());

        Boolean check = field.getCropRow().get(0).getCropsList().get(0).getIsFertilized();


        Assert.assertTrue(check);


    }
}
