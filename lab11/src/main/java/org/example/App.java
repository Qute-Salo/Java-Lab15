package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("=== 1. ДЕМОНСТРАЦИЯ ПЕРЕГРУЗКИ (Статический полиморфизм) ===");

        Instrument basicInstrument = new Instrument("Простой инструмент", "Общий", "Бип");
        basicInstrument.play();
        basicInstrument.play(80);
        basicInstrument.play("В лесу родилась елочка");


        System.out.println("\n=== 2. ДЕМОНСТРАЦИЯ ПЕРЕОПРЕДЕЛЕНИЯ (Динамический полиморфизм) ===");

        Instrument[] orchestra = {
                new Guitar("Fender Stratocaster", "Бринь-бринь", 6),
                new Piano("Yamaha Clavinova", "Плим-плим", true)
        };


        for (Instrument inst : orchestra) {
            System.out.println("Инструмент: " + inst.getName() + " -> " + inst.getSoundType());
            inst.play(); // Также вызывается метод базового класса, но с контекстом наследника
        }


        System.out.println("\n=== 3. СРАВНЕНИЕ СТАТИЧЕСКОГО И ДИНАМИЧЕСКОГО ПОЛИМОРФИЗМА ===");


        Guitar myGuitar = new Guitar("Gibson", "Рок-звук", 6);
        myGuitar.tune();
        myGuitar.tune("Drop D");


        Instrument polyInstrument = myGuitar;
        System.out.println("Результат вызова полиморфного метода: " + polyInstrument.getSoundType());
    }
}