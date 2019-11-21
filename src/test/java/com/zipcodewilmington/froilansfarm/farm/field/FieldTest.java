package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.food.Crop;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FieldTest {
    @Test
    public void constructorTest(){
        //given
        Integer expected = 0;

        //when
        Field field = new Field();
        Integer actual = field.getNumberOfCropRows();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCropRowTest(){
        //given
        CropRow cropRow = new CropRow();
        CropRow cropRow1 = new CropRow();
        Integer expected = 2;

        //when
        Field field = new Field();
        field.add(cropRow);
        field.add(cropRow1);

        ArrayList<CropRow> test = field.getCropRow();
        Integer actual = test.size();

        //then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, field.getNumberOfCropRows());
    }

}
