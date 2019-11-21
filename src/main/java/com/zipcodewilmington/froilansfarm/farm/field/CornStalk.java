package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.food.Crop;
import com.zipcodewilmington.froilansfarm.farm.food.EarCorn;


public class CornStalk extends Crops {

    public CornStalk(){
        super.setIsFertilized(false);
    }


    @Override
    public Crops yield(){
        if (super.getIsFertilized()) {
            return new EarCorn();
        }
        return null;
    }

}
