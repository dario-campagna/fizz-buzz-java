package it.esteco.fizzbuzz;

public class FizzBuzzRule implements Rule {

    private final FizzRule fizzRule;
    private final BuzzRule buzzRule;

    public FizzBuzzRule() {
        fizzRule = new FizzRule();
        buzzRule = new BuzzRule();
    }

    @Override
    public String apply() {
        return fizzRule.apply() + buzzRule.apply();
    }

    @Override
    public boolean isSatisfiedBy(int number) {
        return fizzRule.isSatisfiedBy(number) && buzzRule.isSatisfiedBy(number);
    }
}
