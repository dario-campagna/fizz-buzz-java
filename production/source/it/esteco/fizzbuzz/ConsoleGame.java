package it.esteco.fizzbuzz;

import java.util.stream.IntStream;

public class ConsoleGame {
    private Game game;

    public ConsoleGame(Game game) {
        this.game = game;
    }

    public void play(IntStream numbers) {
        numbers.forEach(number -> System.out.println(game.say(number)));
    }
}
