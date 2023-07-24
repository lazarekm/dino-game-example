package mirolaza.dinogame.gui;

import mirolaza.dinogame.rules.Referee;

public class Playground {
    private final Referee referee;

    public Playground(Referee referee) {
        System.out.println("Initialize Playground");
        this.referee = referee;
    }

    public void play() {
        System.out.println("Game initialized");
    }
}
