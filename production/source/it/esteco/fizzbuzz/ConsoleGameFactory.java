package it.esteco.fizzbuzz;

import java.util.Arrays;

public class ConsoleGameFactory {

    public static ConsoleGame createConsoleFizzBuzz() {
        return new ConsoleGame(new Game(Arrays.asList(new FizzRule(), new BuzzRule())));
    }

    public static ConsoleGame createConsoleFizzBuzzBang() {
        return new ConsoleGame(new Game(Arrays.asList(new FizzRule(), new BuzzRule(), new BangRule())));
    }
}
