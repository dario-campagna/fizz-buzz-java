package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FizzBuzzRuleTest {

    @Test
    public void isSatisfiedByMultiplesOfThreeAndFive() {
        FizzBuzzRule rule = new FizzBuzzRule();

        assertTrue(rule.isSatisfiedBy(15));
        assertFalse(rule.isSatisfiedBy(9));
        assertFalse(rule.isSatisfiedBy(20));
    }

}
