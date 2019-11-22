package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.farm.field.Field;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import java.util.ArrayList;


public class Tractor extends FarmVehicle implements NoiseMaker, Rideable {

    public ArrayList<Crops> harvest(Field field) {
        ArrayList<Crops> harvestedCrops = new ArrayList<Crops>();

        for(CropRow row : field.getCropRow()){
            for(Crops each : row.getCropsList()){
                if(each.getIsFertilized())
                     harvestedCrops.add(each);
            }
        }
        return harvestedCrops;


    }
    public boolean makeNoise() {
        return "rrrrrrrrrrrr";
    }

}
