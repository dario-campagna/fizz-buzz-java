package it.esteco.fizzbuzz;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FizzBuzz {

    private List<Rule> rules;

    public FizzBuzz(List<Rule> rules) {
        this.rules = rules;
    }

    public void print(IntStream numbers) {
        numbers.forEach(number -> System.out.println(findRuleFor(number).orElse(new DefaultRule()).applyTo(number)));
    }

    private Optional<Rule> findRuleFor(int number) {
        return rules.stream().filter(rule -> rule.applyTo(number) != null).findFirst();
    }

}
