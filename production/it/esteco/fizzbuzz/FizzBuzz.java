package it.esteco.fizzbuzz;

import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules) {
        this.rules = rules;
    }

    public void print(IntStream numbers) {
        numbers.forEach(number -> System.out.println(rules.get(0).apply(number)));
    }

}
