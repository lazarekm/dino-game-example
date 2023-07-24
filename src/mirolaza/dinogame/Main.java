package mirolaza.dinogame;

import mirolaza.dinogame.gui.Playground;
import mirolaza.dinogame.rules.Referee;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start main");
        Referee referee = new Referee();
        Playground playground = new Playground(referee);
        playground.play();
    }
}