package it.esteco.fizzbuzz;

import java.util.stream.IntStream;

public class FizzBuzz {

    private DefaultRule rule;

    public FizzBuzz(DefaultRule rule) {
        this.rule = rule;
    }

    public void print(IntStream numbers) {
        numbers.forEach(number -> System.out.println(rule.apply(number)));
    }

}
