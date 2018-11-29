package it.esteco.fizzbuzz;

import java.util.Arrays;

public class GameFactory {

    public static Game createFizzBuzz() {
        return new Game(Arrays.asList(new FizzBuzzRule(), new FizzRule(), new BuzzRule()));
    }

}
