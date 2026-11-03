package org.example;

public class Editor implements Installable, Updatable {
    private String name;
    private String version;
    private String format;

    public Editor(String name, String version, String format) {
        this.name = name;
        this.version = version;
        this.format = format;
    }

    @Override
    public void install() {
        System.out.println("Установка редактора: " + name + " [Формат: " + format + "]");
    }

    @Override
    public void uninstall() {
        System.out.println("Удаление редактора: " + name);
    }

    @Override
    public void update() {
        System.out.println("Обновление редактора " + name + "...");
        this.version = "v5.4";
    }

    @Override
    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }
}