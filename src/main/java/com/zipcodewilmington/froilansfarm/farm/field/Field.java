package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.interfaces.Storage;

import java.util.ArrayList;

public class Field implements Storage<CropRow> {
    private ArrayList<CropRow> cropRow;

    public Field(){
        cropRow = new ArrayList<CropRow>();
    }


    public Integer getNumberOfCropRows(){

        return this.cropRow.size();
    }

    public void add(CropRow cropRow) {
        this.cropRow.add(cropRow);
    }

    public ArrayList<CropRow> getCropRow(){
        return cropRow;
    }
}
