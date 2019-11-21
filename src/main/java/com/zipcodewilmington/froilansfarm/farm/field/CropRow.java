package com.zipcodewilmington.froilansfarm.farm.field;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crops> cropsList;

    public CropRow(){
        cropsList = new ArrayList<Crops>();
    }

    public CropRow(List<Crops> cropsList){
        this.cropsList = cropsList;
    }

    public List<Crops> getCropsList(){
        return this.cropsList;
    }

    public Integer getNumberOfCrops(){
        return this.cropsList.size();
    }

    public void add(Crops crops) {
        cropsList.add(crops);
    }

    public void removeAll() {
        cropsList.clear();
    }

}
