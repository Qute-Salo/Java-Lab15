package org.example;

public class Game implements Installable, Updatable {
    private String name;
    private String version;
    private String genre;

    public Game(String name, String version, String genre) {
        this.name = name;
        this.version = version;
        this.genre = genre;
    }

    @Override
    public void install() {
        System.out.println("Установка игры: " + name + " (" + genre + ")");
    }

    @Override
    public void uninstall() {
        System.out.println("Удаление игры: " + name);
    }

    @Override
    public void update() {
        System.out.println("Обновление игры " + name + " до новой версии.");
        this.version = "v2.0";
    }

    @Override
    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }
}