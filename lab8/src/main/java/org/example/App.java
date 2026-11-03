package org.example;

public class App {
    public static void main(String[] args) {
        Dishware[] cupboard = new Dishware[5];

        cupboard[0] = new Plate("Глубокая суповая", 0.5, "Белый", 22.0);
        cupboard[1] = new Plate("Десертная", 0.2, "Розовый", 16.5);
        cupboard[2] = new Plate("Подставная", 0.0, "Золотой", 30.0);

        cupboard[3] = new Cup("Кофейная чашка", 0.1, "Черный", true);
        cupboard[4] = new Cup("Пиала для чая", 0.25, "Синий", false);

        System.out.println("=== Общая информация о посуде ===");
        for (Dishware item : cupboard) {
            item.displayInfo();
            System.out.print("Предназначение: ");
            item.use();

            if (item instanceof Plate plate) {
                plate.stack();
            } else if (item instanceof Cup cup) {
                cup.fill();
            }
            System.out.println("------------------------------------------------");
        }
    }
}
