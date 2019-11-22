package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {

    private Aircraft aircraft;

    public Pilot(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    //Nullary Constructor
    public Pilot(){}

    public void mount(Rideable ride) {
        ride.ride(this);
    }

    public void dismount(Rideable ride) { }

    public  Aircraft getAircraft(){
        return aircraft;
    }

    public void fly(Aircraft aircraft){
        this.aircraft = aircraft;
    }

    public void landAircraft(){
        this.aircraft = null;
    }
}
