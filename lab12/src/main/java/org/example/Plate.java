package org.example;

public class Plate extends Dish {
    private double diameter;

    public Plate(String name, String id, double volume, double diameter) {
        super(name, id, volume);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Plate{diameter=" + diameter + "}";
    }
}