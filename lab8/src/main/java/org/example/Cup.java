package org.example;

public class Cup extends Dishware {
    private boolean hasHandle;

    public Cup(String name, double volume, String color, boolean hasHandle) {
        super(name, volume, color);
        this.hasHandle = hasHandle;
    }

    public boolean isHasHandle() { return hasHandle; }
    public void setHasHandle(boolean hasHandle) { this.hasHandle = hasHandle; }

    @Override
    public void use() {
        System.out.println("Для напитков");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(", Наличие ручки: " + (hasHandle ? "Да" : "Нет"));
    }

    public void fill() {
        System.out.println("Чашка \"" + getName() + "\" наполнена любимым напитком.");
    }
}
