package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farm.field.Crops;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist, Rider, Eater {
    private String name;
    Tractor tractor;

    public Farmer(Tractor tractor){
        this.tractor = tractor;
    }

    public Farmer(String name){
        this.name = name;
    }

    public Farmer(){
        this.name = "Froilan";
    }

    public String getName(){
        return name;
    }


    public ArrayList<Crops> plant(Crops crops, CropRow cropRows) {
        ArrayList<Crops> cropsList = cropRows.getCropsList();
        cropsList.add(crops);

        return cropsList;
    }

    public void mount(Rideable rideable ) {
        rideable.ride(this);
    }


    public void dismount(Rideable ride) {


    }

    public void eat(Edible food){

    }

    public  Tractor getTractor(Tractor tractor){
        return tractor;
    }

    public void setTractor(Tractor tractor){
        this.tractor = tractor;
    }
}
