package it.esteco.fizzbuzz;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Game {

    private final List<Rule> rules;

    public <T> Game(List<Rule> rules) {
        this.rules = rules;
    }

    public String say(int number) {
        return valueFor(number);
    }

    private String valueFor(int number) {
        return findRulesFor(number)
                .map(Rule::apply)
                .reduce(String::concat)
                .orElse(String.valueOf(number));
    }

    private Stream<Rule> findRulesFor(int number) {
        return rules.stream().filter(rule -> rule.isSatisfiedBy(number));
    }

}
