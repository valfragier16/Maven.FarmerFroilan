package com.zipcodewilmington.froilansfarm.warehouses;

import com.zipcodewilmington.froilansfarm.animal.farmanimals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.food.Egg;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop {
    List<Chicken> chickenList = new ArrayList<Chicken>();
    private Egg egg;

    // Constructor
    public ChickenCoop(List<Chicken> chickenCoop){
        this.chickenList = chickenCoop;

    }
    // Nullary-Constructor
    public ChickenCoop(){

    }
    public List<Chicken> getChickenList(){ return chickenList; }

    public void setChickenList(List<Chicken> chickenList){ this.chickenList = chickenList;}

    public void add(Chicken chicken) { this.chickenList.add(chicken); }

    public void remove(Chicken chicken){ chickenList.remove(chicken); }

    public Integer getCount() { return chickenList.size(); }

    public void clear() { chickenList.clear(); }

    public static Boolean checkChickenFertilization(List<Chicken> chickenCoop){
        for (Chicken c: chickenCoop ) {
            c.hasBeenFertilized();
        }
        return true;
    }

    public static List<Egg> collectEdibleEggs(List<Chicken> chickenCoop) {
        List<Egg> edibleEggs = new ArrayList<>();
        if (checkChickenFertilization(chickenCoop) == true) {
            for (Chicken c : chickenCoop) {
                edibleEggs.add(c.yield());
            }
        }
        return edibleEggs;
    }

}
