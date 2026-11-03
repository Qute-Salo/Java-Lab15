package org.example;

public class App {
    public static void main(String[] args) {

        Installable[] items = new Installable[] {
                new Game("Cyberpunk 2077", "1.0", "RPG"),
                new Game("Dota 2", "7.35", "MOBA"),
                new Game("Minecraft", "1.20", "Sandbox"),
                new Editor("Visual Studio Code", "1.85", "Source Code"),
                new Editor("Adobe Photoshop", "25.0", "Raster Graphics")
        };

        System.out.println("=== УСТАНОВКА ===");
        for (Installable item : items) {
            item.install();
        }

        System.out.println("\n=== ОБНОВЛЕНИЕ ===");
        for (Installable item : items) {

            if (item instanceof Updatable updatable) {
                System.out.println("Текущая версия: " + updatable.getVersion());
                updatable.update();
                System.out.println("Новая версия: " + updatable.getVersion());
            }
        }
    }
}
