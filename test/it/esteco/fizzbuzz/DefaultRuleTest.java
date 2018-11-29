package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DefaultRuleTest {

    @Test
    public void alwaysReturnSameNumber() {
        Rule rule = new DefaultRule();

        assertThat(rule.applyTo(1), is(equalTo("1")));
    }
}
