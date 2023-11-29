package org.example;

// В качестве задачи предлагаю вам реализовать код для демонстрации парадокса Монти Холла
// (Парадокс Монти Холла — Википедия ) и наглядно убедиться в верности парадокса
// (запустить игру в цикле на 1000 и вывести итоговый счет).
//        Необходимо:
//        Создать свой Java Maven или Gradle проект;
//        Самостоятельно реализовать прикладную задачу;
//        Сохранить результат в HashMap<шаг теста, результат>
//        Вывести на экран статистику по победам и поражениям

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Game gameNotChangingMind = new Game(false, 1000);
        gameNotChangingMind.startGame();
        //game.showAllStatistics();
        gameNotChangingMind.showSummary();

        Game gameChangingMind = new Game(true, 1000);
        gameChangingMind.startGame();
        //game.showAllStatistics();
        gameChangingMind.showSummary();

    }
}