package com.zipcodewilmington.froilansfarm.animal.farmanimals;

import com.zipcodewilmington.froilansfarm.animal.Animal;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Horse extends Animal {

    private Boolean hasBeenRiddenToday;

    public Horse(){
        hasBeenRiddenToday = false;
    }


    public String makeNoise() {
        return "Neigh!";
    }

    public void ride(Rider rider) {
        hasBeenRiddenToday = true;
    }


    public Boolean getHasBeenRiddenToday() {
        return hasBeenRiddenToday;
    }

}
