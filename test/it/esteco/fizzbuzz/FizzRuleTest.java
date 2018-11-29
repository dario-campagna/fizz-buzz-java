package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class FizzRuleTest {

    @Test
    public void returnFizzWhenMultipleOfThree() {
        FizzRule rule = new FizzRule();

        assertThat(rule.applyTo(3), is(equalTo("Fizz")));
        assertThat(rule.applyTo(18), is(equalTo("Fizz")));
    }

    @Test
    public void returnNullIfNotMultipleOfThree() {
        FizzRule rule = new FizzRule();

        assertNull(rule.applyTo(1));
    }

}
