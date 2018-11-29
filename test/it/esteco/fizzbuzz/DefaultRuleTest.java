package it.esteco.fizzbuzz;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class DefaultRuleTest {

    @Test
    public void alwaysReturnSameNumber() {
        DefaultRule rule = new DefaultRule(1);

        assertThat(rule.apply(), is(equalTo("1")));
    }

    @Test
    public void alwaysSatisfied() {
        DefaultRule rule = new DefaultRule(1);

        assertTrue(rule.isSatisfiedBy(1));
    }
}
