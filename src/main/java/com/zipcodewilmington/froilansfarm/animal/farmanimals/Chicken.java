package com.zipcodewilmington.froilansfarm.animal.farmanimals;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.farm.food.Egg;

public class Chicken extends Animal {
    private Egg edibleEgg;
    private Boolean fertilized;


    public Chicken(){
        fertilized = false;}

    public Boolean isFertilized() {
        return fertilized;
    }

    public boolean hasBeenFertilized(){
        fertilized = true;
        return true;
    }


    public void setIsFertilized(Boolean fertilized) {
        this.fertilized = hasBeenFertilized();
    }

    public Egg yield() {
        return edibleEgg;
    }

    public Egg getEgg(){
        return edibleEgg;
    }

    public String makeNoise() {
        return "Bawk bawk!"; }

}
