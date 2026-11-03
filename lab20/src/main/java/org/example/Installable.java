package org.example;

public interface Installable {
    void install();
    void uninstall();

    static void showStatus(Installable item) {
        System.out.println("Проверка состояния объекта...");
    }
}