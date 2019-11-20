package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;

import java.util.List;

public class CropDuster extends FarmVehicle implements Aircraft {
    public String makeNoise() {
        return "Engine Roaring";
    }

    public void fertilize(CropRow cropRow) {
        List<Crop> cropToFertilize =   cropRow.getCropList();
        for(Crop c: cropToFertilize){
            c.setIsFertilized(true);
        }
    }

    public void fertilize(CropRows cropRows) {

    }
}
