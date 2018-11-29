package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BuzzRuleTest {

    @Test
    public void returnsBuzz() {
        assertThat(new BuzzRule().apply(), is(equalTo("Buzz")));
    }

    @Test
    public void returnTrueWhenMultipleOfFive() {
        BuzzRule buzzRule = new BuzzRule();

        assertTrue(buzzRule.isSatisfiedBy(5));
        assertTrue(buzzRule.isSatisfiedBy(25));
    }

    @Test
    public void returnFalseIfNotMultipleOfFive() {
        BuzzRule buzzRule = new BuzzRule();

        assertFalse(buzzRule.isSatisfiedBy(1));
    }
}
