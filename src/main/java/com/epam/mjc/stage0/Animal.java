package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pws = "";
        if (numberOfPaws == 1) {
            pws = " paw";
        } else if (numberOfPaws > 1) {
            pws = " paws";
        }
        String infoAnimal = "This animal is mostly " + color + ". It has " + numberOfPaws + pws + " and " + (hasFur ? "a" : "no") + " fur.";
        return infoAnimal;
    }


}
