package it.esteco.fizzbuzz;

public class BangRule implements Rule {
    @Override
    public String apply() {
        return "Bang";
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return number % 7 == 0;
    }
}
