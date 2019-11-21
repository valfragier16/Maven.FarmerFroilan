package com.zipcodewilmington.froilansfarm.warehouses;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    public static ArrayList<ChickenCoop> createMultiChickenCoops(Integer amount) {
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();

        for(int i = 0; i<amount; i++){
            chickenCoops.add(new ChickenCoop());
        }

        return chickenCoops;
    }


    public static ArrayList<CropRow> createMultiCropRows(Integer amount) {
        ArrayList<CropRow> cropRows = new ArrayList<CropRow>();

        for(int i = 0; i<amount; i++){
            cropRows.add(new CropRow());
        }

        return cropRows;
    }

    public static CropRow createSingleCropRow() {
        CropRow cropRows = createMultiCropRows(1).get(0);

        return cropRows;
    }


    public static ArrayList<Stable> createMultiStables(Integer amount) {
        ArrayList<Stable> stables = new ArrayList<Stable>();

        for(int i = 0; i<amount; i++){
            stables.add(new Stable());
        }

        return stables;
    }

    public static Stable createSingleStables() {
        Stable stables = createMultiStables(1).get(0);

        return stables;
    }


}
