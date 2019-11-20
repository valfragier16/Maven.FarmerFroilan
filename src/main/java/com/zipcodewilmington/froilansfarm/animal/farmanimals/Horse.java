package com.zipcodewilmington.froilansfarm.animal.farmanimals;

import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Horse {

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

    public void setHasBeenRiddenToday(Boolean hasBeenRiddenToday) {
        this.hasBeenRiddenToday = hasBeenRiddenToday;
    }
}
