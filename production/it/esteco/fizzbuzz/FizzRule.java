package it.esteco.fizzbuzz;

public class FizzRule implements Rule {
    @Override
    public String apply() {
        return "Fizz";
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return number % 3 == 0;
    }
}
