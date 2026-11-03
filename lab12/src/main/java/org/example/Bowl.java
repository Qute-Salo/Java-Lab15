package org.example;

public class Bowl extends Dish {
    private double depth;

    public Bowl(String name, String id, double volume, double depth) {
        super(name, id, volume);
        this.depth = depth;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Bowl{depth=" + depth + "}";
    }
}