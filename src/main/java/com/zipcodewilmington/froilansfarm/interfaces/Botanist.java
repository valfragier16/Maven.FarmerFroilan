package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public interface Botanist {
    void plant(Crops crops, CropRow cropRows);
}
