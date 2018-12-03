package it.esteco.fizzbuzz;

import java.util.Arrays;

public class GameFactory {

    public static Game createFizzBuzz() {
        return new Game(Arrays.asList(new FizzRule(), new BuzzRule()));
    }

    public static Game createFizzBuzzBang() {
        return new Game(Arrays.asList(new FizzRule(), new BuzzRule(), new BangRule()));
    }
}
