package org.example;

public interface Updatable {
    void update();
    String getVersion();

    static void checkInfo() {
        System.out.println("Система обновлений активна.");
    }
}