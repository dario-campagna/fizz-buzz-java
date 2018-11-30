package it.esteco.fizzbuzz;

public interface Rule {
    String apply();

    boolean isSatisfiedBy(int number);
}
