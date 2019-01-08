package kata.fizzbuzz;

import java.util.stream.IntStream;

public class ConsoleGame {
    private Game game;

    public ConsoleGame() {
        this.game = new Game();
    }

    public void play(IntStream numbers) {
        numbers.forEach(number -> System.out.println(game.say(number)));
    }
}
