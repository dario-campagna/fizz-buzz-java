package it.esteco.fizzbuzz;

public class BuzzRule implements Rule {
    @Override
    public String applyTo(int number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return null;
    }
}
