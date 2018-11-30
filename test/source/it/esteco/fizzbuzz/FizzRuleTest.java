package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class FizzRuleTest {

    @Test
    public void returnsFizz() {
        assertThat(new FizzRule().apply(), is(equalTo("Fizz")));
    }

    @Test
    public void isSatisfiedByMultiplesOfThree() {
        FizzRule rule = new FizzRule();

        assertTrue(rule.isSatisfiedBy(3));
        assertTrue(rule.isSatisfiedBy(18));
        assertFalse(rule.isSatisfiedBy(1));
    }

}
