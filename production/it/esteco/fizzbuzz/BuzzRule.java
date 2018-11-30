package it.esteco.fizzbuzz;

public class BuzzRule implements Rule {
    @Override
    public String apply() {
        return "Buzz";
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return isMultipleOfFive(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}
