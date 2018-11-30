package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class FizzBuzzRuleTest {

    @Test
    public void returnsFizzBuzz() {
        assertThat(new FizzBuzzRule().apply(), is(equalTo("FizzBuzz")));
    }

    @Test
    public void isSatisfiedByMultiplesOfThreeAndFive() {
        FizzBuzzRule rule = new FizzBuzzRule();

        assertTrue(rule.isSatisfiedBy(15));
        assertFalse(rule.isSatisfiedBy(9));
        assertFalse(rule.isSatisfiedBy(20));
    }

}
