package org.example;

public class Forward extends Sportsman {
    private int goals;

    public Forward(String name, String team, int number, int goals) {
        super(name, team, number);
        this.goals = goals;
    }

    @Override
    public String getPosition() {
        return "Нападающий";
    }

    @Override
    public String getStatistics() {
        return goals + " голов, 5 передач";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Позиция: " + getPosition() + " | Статистика: " + getStatistics());
        System.out.println("----------------------------------------");
    }
}