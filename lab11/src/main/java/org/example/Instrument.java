package org.example;

public class Instrument {

    private String name;
    private String type;
    private String sound;


    public Instrument(String name, String type, String sound) {
        this.name = name;
        this.type = type;
        this.sound = sound;
    }


    public void play() {
        System.out.println(name + ": Играю (" + sound + ")");
    }

    public void play(int volume) {
        System.out.println(name + ": Играю громкостью " + volume);
    }

    public void play(String melody) {
        System.out.println(name + ": Играю мелодию \"" + melody + "\"");
    }


    public String getSoundType() {
        return "Стандартный звук";
    }


    public String getName() {
        return name;
    }
}