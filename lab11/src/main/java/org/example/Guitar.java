package org.example;

public class Guitar extends Instrument {

    private int stringsCount;

    public Guitar(String name, String sound, int stringsCount) {
        super(name, "Струнный", sound);
        this.stringsCount = stringsCount;
    }


    @Override
    public String getSoundType() {
        return "Струнный звук (" + stringsCount + " струн)";
    }


    public void tune() {
        System.out.println("Настройка гитары " + getName() + " по умолчанию.");
    }

    public void tune(String scale) {
        System.out.println("Настройка гитары " + getName() + " в строй: " + scale);
    }
}