package it.esteco.fizzbuzz;

public class DefaultRule implements Rule {
    @Override
    public String apply(int number) {
        return String.valueOf(number);
    }
}
