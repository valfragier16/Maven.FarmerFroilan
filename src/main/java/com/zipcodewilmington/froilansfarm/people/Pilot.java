package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Pilot extends Person implements Rider {

    public void mount(Rideable ride) {
        ride.ride(this);
    }

    public void dismount(Rideable ride) {

    }
}
