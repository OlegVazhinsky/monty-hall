package org.example;

import java.util.Random;

public class Master {
    private int giftBox;
    private int emptyBox1;
    private int emptyBox2;

    private Random random;

    public Master() {
        random = new Random();
    }

    public void makeNewGame() {
        giftBox = random.nextInt(1,4);
        if (giftBox == 1) {
            emptyBox1 = 2;
            emptyBox2 = 3;
        } else if (giftBox == 2) {
            emptyBox1 = 1;
            emptyBox2 = 3;
        } else {
            emptyBox1 = 1;
            emptyBox2 = 2;
        }
    }

    public int showEmptyBox(int playersChoise){
        if (playersChoise == 1) {
            if (giftBox == 1) return emptyBox1;
            else if (giftBox == 2) return emptyBox2;
            else return emptyBox2;
        } else if (playersChoise == 2) {
            if (giftBox == 1) return emptyBox2;
            else if (giftBox == 2) return emptyBox1;
            else return emptyBox1;
        } else return emptyBox1;
    }

    public boolean isPlayerWins(int playersChoise) {
        if (playersChoise == giftBox) return true;
        else return false;
    }


    @Override
    public String toString() {
        return "Master{" +
                "giftBox=" + giftBox +
                ", emptyBox1=" + emptyBox1 +
                ", emptyBox2=" + emptyBox2 + "}";
    }
}
