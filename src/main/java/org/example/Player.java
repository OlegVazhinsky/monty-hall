package org.example;

import java.util.Random;

public class Player {
    private int choise;
    private Random random;
    private boolean changeMind;

    public Player(boolean changeMind) {
        random = new Random();
        this.changeMind = changeMind;
    }

    public int chooseBox() {
        choise = random.nextInt(1,4);
        return choise;
    }

    public int changeChoise(int emptyBox){
        if (changeMind) {
            if (choise == 1) {
                if (emptyBox == 2) choise = 3;
                else choise = 2;
            } else if (choise == 2) {
                if (emptyBox == 1) choise = 3;
                else choise = 1;
            } else {
                if (emptyBox == 1) choise = 2;
                else choise = 1;
            }
        }
        return choise;
    }

}
