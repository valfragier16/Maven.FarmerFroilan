package com.zipcodewilmington.froilansfarm.vehicles;


import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.farm.food.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;


import java.util.ArrayList;


public class CropDuster implements Aircraft {
    boolean isFlying;

    public CropDuster(){

    }
    public void fertilizeCrop(ArrayList<CropRow> crops){
        for(CropRow row: crops){
            for(Crops each : row.getCropsList())
                each.setIsFertilized(true);
        }
    }


    public void fertilize(CropRow cropRows) {

    }

    public boolean fly() {
        isFlying = true;
        return isFlying;
    }

    public boolean landAircraft() {
        isFlying = false;
        return isFlying;
    }
}
