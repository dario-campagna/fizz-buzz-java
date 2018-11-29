package it.esteco.fizzbuzz;

public class DefaultRule implements Rule {
    @Override
    public String applyTo(int number) {
        return String.valueOf(number);
    }
}
