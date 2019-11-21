package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farm.field.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.List;

public class Farmer extends Person implements Botanist, Rider {
    private String name;

    public Farmer(String name){
        this.name = name;
    }

    public Farmer(){
        this.name = "Froilan";
    }

    public String getName(){
        return name;
    }


    public void plant(Crop crop, CropRow cropRows) {
        List<Crop> cropList = cropRows.getCropList();
        cropList.add(crop);
    }

    public void mount(Rideable rideable ) {
        rideable.ride(this);
    }


    public void dismount(Rideable ride) {

    }
}
