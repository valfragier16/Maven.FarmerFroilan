package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

import java.util.ArrayList;

public interface Botanist {
    ArrayList<Crops> plant(Crops crops, CropRow cropRows);
}
