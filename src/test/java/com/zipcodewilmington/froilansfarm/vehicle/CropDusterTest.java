package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.farm.field.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CropDusterTest {

    ArrayList<CropRow> field = new ArrayList<CropRow>();
    @Before
    public void setUp(){
        CropRow row = new CropRow();
        row.add(new Crops());
        row.add(new Crops());
        row.add(new TomatoPlant());
        row.add(new CornStalk());

        Field fields = new Field();
        fields.add(row);

        field = fields.getCropRow();

    }

    @Test
    public void fertilizerTest(){
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilizeCrop(field);

        Boolean check = field.get(0).getCropsList().get(0).getIsFertilized();

        Assert.assertTrue(check);


    }
}
