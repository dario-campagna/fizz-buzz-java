package it.esteco.fizzbuzz;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Game {

    private List<Rule> rules;

    public Game(List<Rule> rules) {
        this.rules = rules;
    }

    public void print(IntStream numbers) {
        numbers.forEach(number -> System.out.println(
                findRulesFor(number)
                        .map(Rule::apply)
                        .reduce(String::concat)
                        .orElse(new DefaultRule(number).apply())));
    }

    private Stream<Rule> findRulesFor(int number) {
        return rules.stream().filter(rule -> rule.isSatisfiedBy(number));
    }

}
