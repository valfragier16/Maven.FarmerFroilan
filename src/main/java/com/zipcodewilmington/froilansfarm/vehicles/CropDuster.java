package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.farm.food.Crop;


import java.util.ArrayList;


public class CropDuster {

    public CropDuster(){

    }
    public void fertilizeCrop(ArrayList<CropRow> crops){
        for(CropRow row: crops){
            for(Crops each : row.getCropsList())
                each.setIsFertilized(true);
        }
    }
}
