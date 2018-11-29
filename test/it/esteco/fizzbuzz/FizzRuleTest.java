package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FizzRuleTest {

    @Test
    public void returnFizz() {
        FizzRule rule = new FizzRule();

        assertThat(rule.apply(3), is(equalTo("Fizz")));
    }

}
