package org.example;

public class Dishware {
    private String name;
    private double volume;
    private String color;

    public Dishware(String name, double volume, String color) {
        this.name = name;
        this.volume = volume;
        this.color = color;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getVolume() { return volume; }
    public void setVolume(double volume) { this.volume = volume; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public void use() {
        System.out.println("Используем посуду по назначению.");
    }

    public void displayInfo() {
        System.out.print("Посуда: " + name + ", Объем: " + volume + " л, Цвет: " + color);
    }
}
