package com.galvanize.classes;

import com.galvanize.Interfaces.Food;

import java.util.ArrayList;

class HotDog implements Food {

    private ArrayList<String> toppings = new ArrayList<>();

    @Override
    public void eat() {
        // Do the eating...
    }

    @Override
    public boolean hasGluten() {
        return true; // We'll assume there's a regular bun.
    }

    public boolean isChiliDog() {
        return toppings.contains("Chili");
    }
}