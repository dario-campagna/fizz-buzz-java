package kata.fizzbuzz;

import java.util.stream.IntStream;

public class StdOutGame {
    private Game game;

    public StdOutGame() {
        this.game = new Game();
    }

    public void play(IntStream numbers) {
        numbers.forEach(number -> System.out.println(game.say(number)));
    }
}
