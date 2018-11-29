package it.esteco.fizzbuzz;

public class FizzBuzzRule implements Rule {
    @Override
    public String apply() {
        return null;
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
