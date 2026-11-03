package org.example;

public class Defender extends Sportsman {
    private int tackles;

    public Defender(String name, String team, int number, int tackles) {
        super(name, team, number);
        this.tackles = tackles;
    }

    @Override
    public String getPosition() {
        return "Защитник";
    }

    @Override
    public String getStatistics() {
        return tackles + " отборов, 10 перехватов";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Позиция: " + getPosition() + " | Статистика: " + getStatistics());
        System.out.println("----------------------------------------");
    }
}