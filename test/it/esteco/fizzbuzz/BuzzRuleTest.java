package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class BuzzRuleTest {

    @Test
    public void returnBuzzWhenMultipleOfFive() {
        BuzzRule buzzRule = new BuzzRule();

        assertThat(buzzRule.applyTo(5), is(equalTo("Buzz")));
        assertThat(buzzRule.applyTo(25), is(equalTo("Buzz")));
    }

    @Test
    public void returnNullIfNotMultipleOfFive() {
        BuzzRule buzzRule = new BuzzRule();

        assertNull(buzzRule.applyTo(1));
    }
}
