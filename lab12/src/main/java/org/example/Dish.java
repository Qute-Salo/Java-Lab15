package org.example;

public class Dish {
    private String name;
    private String id;
    private double volume;

    public Dish(String name, String id, double volume) {
        this.name = name;
        this.id = id;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Dish{name='" + name + "', id='" + id + "', volume=" + volume + "}";
    }
}