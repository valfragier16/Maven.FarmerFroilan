package com.zipcodewilmington.froilansfarm.farm.field;

import java.util.ArrayList;
import java.util.List;

public class CropRow {
    private List<Crop> cropList;

    public CropRow(){
        cropList = new ArrayList<Crop>();
    }

    public CropRow(List<Crop> cropList){
        this.cropList = cropList;
    }

    public List<Crop> getCropList(){
        return this.cropList;
    }

    public Integer getNumberOfCrops(){
        if (cropList.size() != 0) {
            return cropList.size();
        }
        return null;
    }

    public void add(Crop crop) {
        cropList.add(crop);
    }

    public void removeAll() {
        cropList.clear();
    }

}
