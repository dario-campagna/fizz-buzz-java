package it.esteco.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    private Rule rule;

    public FizzBuzz(Rule rule) {
        this.rule = rule;
    }

    public void print(IntStream numbers) {
        numbers.forEach(number -> System.out.println(rule.apply(number)));
    }

}
