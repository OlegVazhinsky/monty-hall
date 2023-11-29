package org.example;

import java.util.HashMap;

public class Game {

    private HashMap <Integer, Integer> statistics;
    private Player player;
    private Master master;
    private int wins;
    private int count;
    private boolean changeMind;

    public Game(boolean changeMind, int count) {
        this.changeMind = changeMind;
        player = new Player(changeMind);
        master = new Master();
        statistics = new HashMap<>();
        this.count = count;
    }

    public void showAllStatistics() {
        System.out.println("Step - status");
        for (int step : statistics.keySet() ) {
            System.out.println(step + " - " + statistics.get(step));
        }
    }

    public void showSummary() {
        System.out.println("Player wins in " + wins + " games. Player changed his mind - " + changeMind + ".");
    }

    public void startGame(){

        int playersChoise;
        int mastersEmtyBox;
        wins = 0;

        for (int i = 0; i < count; i++) {
            master.makeNewGame();
            //System.out.println(master.toString());
            playersChoise = player.chooseBox();
            //System.out.println("Player choose box number - " + playersChoise);
            mastersEmtyBox = master.showEmptyBox(playersChoise);
            //System.out.println("Master shows empty box number - " + mastersEmtyBox);
            playersChoise = player.changeChoise(mastersEmtyBox);
            //System.out.println("Player changed mind. Now box number - " + playersChoise);
            //System.out.println("Does player win? - " + master.isPlayerWins(playersChoise));
            if (master.isPlayerWins(playersChoise)) wins++;
            statistics.put(i,wins);
            //System.out.println("________________________");
        }
    }

}
