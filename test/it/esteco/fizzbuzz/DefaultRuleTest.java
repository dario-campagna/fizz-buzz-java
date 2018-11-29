package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class DefaultRuleTest {

    @Test
    public void returnSameNumber() {
        DefaultRule rule = new DefaultRule();

        assertThat(rule.apply(1), is(equalTo("1")));
    }
}
