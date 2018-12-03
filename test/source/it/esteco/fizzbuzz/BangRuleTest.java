package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class BangRuleTest {

    @Test
    public void returnsBang() {
        BangRule rule = new BangRule();
        assertThat(rule.apply(), is(equalTo("Bang")));
    }

    @Test
    public void isSatisfiedByMultiplesOfSeven() {
        BangRule rule = new BangRule();
        assertTrue(rule.isSatisfiedBy(7));
        assertFalse(rule.isSatisfiedBy(6));
    }
}
