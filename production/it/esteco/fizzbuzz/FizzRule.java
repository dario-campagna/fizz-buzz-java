package it.esteco.fizzbuzz;

public class FizzRule implements Rule {
    @Override
    public String applyTo(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return null;
    }
}
