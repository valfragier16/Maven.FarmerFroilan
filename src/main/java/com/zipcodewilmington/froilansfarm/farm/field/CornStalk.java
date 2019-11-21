package com.zipcodewilmington.froilansfarm.farm.field;

import com.zipcodewilmington.froilansfarm.farm.food.Crop;
import com.zipcodewilmington.froilansfarm.farm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;


public class CornStalk extends Crop {

    public CornStalk(){
        super.setIsFertilized(false);
    }


    @Override
    public Edible yield(){
        if (super.getIsFertilized()) {
            return new EarCorn();
        }
        return null;
    }

}
