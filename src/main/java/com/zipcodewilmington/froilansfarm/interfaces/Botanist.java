package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public interface Botanist {
    void plant(Crop crop, CropRow cropRows);
}
