package com.zipcodewilmington.froilansfarm.farm.field;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private ArrayList<Crops> cropsList;

    public CropRow(){
        cropsList = new ArrayList<Crops>();
    }

    public CropRow(ArrayList<Crops> cropsList){
        this.cropsList = cropsList;
    }

    public ArrayList<Crops> getCropsList(){
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
