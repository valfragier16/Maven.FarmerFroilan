package com.zipcodewilmington.froilansfarm.farm.food;

import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private Boolean isFertilized;

    public Crops yield() {
        return null;
    }


    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

}
