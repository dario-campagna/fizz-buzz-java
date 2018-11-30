package it.esteco.fizzbuzz;

public class DefaultRule implements Rule {
    private int number;

    public DefaultRule(int number) {
        this.number = number;
    }

    @Override
    public String apply() {
        return String.valueOf(number);
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return true;
    }
}
