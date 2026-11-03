package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Sportsman> teamRoster = new ArrayList<>();

        teamRoster.add(new Forward("Александр Овечкин", "Вашингтон", 8, 10));
        teamRoster.add(new Forward("Килиан Мбаппе", "Реал Мадрид", 9, 12));

        teamRoster.add(new Defender("Вирджил ван Дейк", "Ливерпуль", 4, 20));
        teamRoster.add(new Defender("Никита Зайцев", "СКА", 22, 15));
        teamRoster.add(new Defender("Серхио Рамос", "Севилья", 4, 25));

        System.out.println("=== ВЫВОД СТАТИСТИКИ СПОРТСМЕНОВ ===\n");

        for (Sportsman sportsman : teamRoster) {
            sportsman.displayInfo();
        }
    }
}
