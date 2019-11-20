package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.animal.Animal;

public class Person extends Animal {

    private String name;

    public String makeNoise() {
    return "YAY! I'M ALIVE";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
