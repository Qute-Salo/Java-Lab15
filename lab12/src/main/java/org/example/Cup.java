package org.example;

public class Cup extends Dish {
    private boolean handle;

    public Cup(String name, String id, double volume, boolean handle) {
        super(name, id, volume);
        this.handle = handle;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Cup{handle=" + handle + "}";
    }
}