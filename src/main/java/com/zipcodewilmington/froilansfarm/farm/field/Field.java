package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.interfaces.Storage;

import java.util.ArrayList;

public class Field implements Storage<CropRow> {
    private ArrayList<CropRow> cropRow;
    private Integer numberOfCropRows;

    public Field(){
        cropRow = new ArrayList<CropRow>();
    }

    public Field(Integer numberOfCropRows){
        this.numberOfCropRows = numberOfCropRows;
    }

    public Integer getNumberOfCropRows(){

        return this.cropRow.size();
    }

    public void setNumberOfCropRows(Integer numberOfCropRows){
        this.numberOfCropRows = numberOfCropRows;
    }

    public void add(CropRow cropRow) {
        this.cropRow.add(cropRow);
    }

    public CropRow getCropRow(Integer index){
        return cropRow.get(index);
    }
}
