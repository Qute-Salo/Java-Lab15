package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("=== ЗАДАНИЕ 1: ПОСУДА ===");
        Map<String, Dish> dishMap = new HashMap<>();

        dishMap.put("Тарелка Обеденная", new Plate("Тарелка Обеденная", "P01", 0.5, 25.0));
        dishMap.put("Тарелка Суповая", new Plate("Тарелка Суповая", "P02", 0.7, 22.0));
        dishMap.put("Тарелка Десертная", new Plate("Тарелка Десертная", "P03", 0.3, 18.0));

        dishMap.put("Чашка Чайная", new Cup("Чашка Чайная", "C01", 0.25, true));
        dishMap.put("Чашка Кофейная", new Cup("Чашка Кофейная", "C02", 0.1, true));
        dishMap.put("Пиала", new Cup("Пиала", "C03", 0.2, false));

        dishMap.put("Салатник Глубокий", new Bowl("Салатник Глубокий", "B01", 1.5, 12.0));
        dishMap.put("Пиала Малая", new Bowl("Пиала Малая", "B02", 0.4, 6.0));

        for (Map.Entry<String, Dish> entry : dishMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " | Значение: " + entry.getValue());
        }

        System.out.println("\n=== ЗАДАНИЕ 2: ТРЕНЕРЫ ===");
        List<Coach> coaches = new ArrayList<>();
        coaches.add(new Coach("01", "Иванов", "Футбол", 1, Arrays.asList(4, 5, 4)));
        coaches.add(new Coach("02", "Петров", "Плавание", 2, Arrays.asList(2, 3, 2)));
        coaches.add(new Coach("03", "Сидоров", "Бокс", 1, Arrays.asList(5, 5, 4)));
        coaches.add(new Coach("04", "Алексеев", "Баскетбол", 3, Arrays.asList(3, 4, 4)));
        coaches.add(new Coach("05", "Яковлев", "Теннис", 2, Arrays.asList(1, 2, 2)));
        coaches.add(new Coach("06", "Борисов", "Футбол", 2, Arrays.asList(4, 4, 4)));

        System.out.println("--- 1. Вывод тренеров со средним рейтингом > 3 ---");
        for (Coach coach : coaches) {
            if (coach.getAverageRating() > 3.0) {
                System.out.println("Тренер: " + coach.getName() + " (Рейтинг: " + coach.getAverageRating() + ")");
            }
        }

        System.out.println("\n--- 2. Повышение уровня тренеров со средним рейтингом >= 4 ---");
        for (Coach coach : coaches) {
            if (coach.getAverageRating() >= 4.0) {
                int oldLevel = coach.getLevel();
                coach.setLevel(oldLevel + 1);
                System.out.println("Тренеру " + coach.getName() + " повышен уровень с " + oldLevel + " до " + coach.getLevel());
            }
        }

        System.out.println("\n--- 3. Печать тренеров на уровне 2 ---");
        printCoaches(coaches, 2);

        System.out.println("\n--- 4. Упорядочивание по убыванию рейтинга (при совпадении - по имени) ---");
        coaches.sort(new Comparator<Coach>() {
            @Override
            public int compare(Coach c1, Coach c2) {
                int ratingCompare = Double.compare(c2.getAverageRating(), c1.getAverageRating());
                if (ratingCompare != 0) {
                    return ratingCompare;
                }
                return c1.getName().compareTo(c2.getName());
            }
        });

        for (Coach coach : coaches) {
            System.out.println("ID: " + coach.getId() + " | Имя: " + coach.getName() + " | Средний рейтинг: " + coach.getAverageRating());
        }
    }

    public static void printCoaches(List<Coach> coaches, int level) {
        for (Coach coach : coaches) {
            if (coach.getLevel() == level) {
                System.out.println("ID: " + coach.getId() + ", Имя: " + coach.getName() + ", Спорт: " + coach.getSport() + ", Уровень: " + coach.getLevel());
            }
        }
    }
}
