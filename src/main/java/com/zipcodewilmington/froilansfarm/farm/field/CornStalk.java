package com.zipcodewilmington.froilansfarm.farm.field;

public class CornStalk extends Crop{

    public CornStalk(){
        super.setIsFertilized(false);
    }


    @Override
    public Corn yield(){
        if (super.getIsFertilized()) {
            return new Corn();
        }
        return null;
    }

}
