package com.zipcodewilmington.froilansfarm.farm.field;


import com.zipcodewilmington.froilansfarm.farm.food.Tomato;
import com.zipcodewilmington.froilansfarm.farm.food.Crop;

public class TomatoPlant extends Crops{
    private Integer numberOfTomatoes;

    public TomatoPlant(){
        super.setIsFertilized(false);
        this.numberOfTomatoes = 0;
    }

    public TomatoPlant(Boolean isFertilized, Integer numberOfTomatoes){
        super.setIsFertilized(isFertilized);
        this.numberOfTomatoes = numberOfTomatoes;
    }


    public Integer getNumberOfTomatoes(){
        return this.numberOfTomatoes;
    }

    public void setNumberOfTomatoes (Integer numberOfTomatoes){
        this.numberOfTomatoes = numberOfTomatoes;
    }

    @Override
    public Crops yield(){
        if (numberOfTomatoes != 0 && super.getIsFertilized()) {
            numberOfTomatoes--;
            return new Tomato();
        }
        return null;
    }

}
