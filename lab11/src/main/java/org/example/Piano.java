package org.example;

public class Piano extends Instrument {

    private boolean isDigital;

    public Piano(String name, String sound, boolean isDigital) {
        super(name, "Клавишный", sound);
        this.isDigital = isDigital;
    }


    @Override
    public String getSoundType() {
        return "Клавишный звук (" + (isDigital ? "Цифровой" : "Акустический") + ")";
    }


    public void pressPedal() {
        System.out.println("Нажата правая педаль (Sustain).");
    }

    public void pressPedal(int durationSeconds) {
        System.out.println("Педаль удерживается в течение " + durationSeconds + " сек.");
    }
}