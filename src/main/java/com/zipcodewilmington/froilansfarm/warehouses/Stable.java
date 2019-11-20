package com.zipcodewilmington.froilansfarm.warehouses;

import com.zipcodewilmington.froilansfarm.animal.farmanimals.Horse;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable(){
        horses = new ArrayList<Horse>();
    }

    public void add(Horse horse) {
        horses.add(horse);
    }

    public Horse retrieve(Integer horseID){
        return this.horses.get(horseID);
    }

    public Integer getCount(){
        return this.horses.size();
    }


}
