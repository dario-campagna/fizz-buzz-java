package kata.fizzbuzz;

import java.util.stream.IntStream;

public class Match {
    private Game game;

    public Match() {
        this.game = new Game();
    }

    public void play(IntStream numbers) {
        numbers.forEach(number -> System.out.println(game.convert(number)));
    }
}
