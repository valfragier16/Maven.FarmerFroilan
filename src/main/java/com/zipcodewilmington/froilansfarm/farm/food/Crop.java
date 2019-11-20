package com.zipcodewilmington.froilansfarm.farm.food;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {

    private Boolean isFertilized;

    public Edible yield() {
        return null;
    }


    public Boolean getIsFertilized(){
        return this.isFertilized;
    }

    public void setIsFertilized(Boolean isFertilized){
        this.isFertilized = isFertilized;
    }

}
