package org.example;

public class Plate extends Dishware {
    private double diameter;

    public Plate(String name, double volume, String color, double diameter) {
        super(name, volume, color);
        this.diameter = diameter;
    }

    public double getDiameter() { return diameter; }
    public void setDiameter(double diameter) { this.diameter = diameter; }

    @Override
    public void use() {
        System.out.println("Для подачи еды");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Диаметр: " + diameter + " см");
    }

    public void stack() {
        System.out.println("Тарелка \"" + getName() + "\" поставлена в стопку.");
    }
}
