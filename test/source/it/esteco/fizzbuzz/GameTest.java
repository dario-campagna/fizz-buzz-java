package it.esteco.fizzbuzz;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GameTest {

    @Test
    public void applyDefaultRuleIfNoRuleGiven() {
        Game game = new Game(Collections.emptyList());

        assertThat(game.say(3), is(equalTo("3")));
    }

    @Test
    public void applyDefaultRuleIfNoRuleIsSatisfied() {
        Game game = new Game(Collections.singletonList(new UnsatisfiableRule()));

        assertThat(game.say(4), is(equalTo("4")));
    }

    @Test
    public void mergeResultOfAllSatisfiedRules() {
        Game game = new Game(Arrays.asList(new UnsatisfiableRule(), new AlwaysSatisfiedRule(), new AlwaysSatisfiedRule()));

        assertThat(game.say(1), is(equalTo("aa")));
    }

    private static class UnsatisfiableRule implements Rule {
        @Override
        public String apply() {
            return null;
        }

        @Override
        public boolean isSatisfiedBy(int number) {
            return false;
        }
    }

    private static class AlwaysSatisfiedRule implements Rule {
        @Override
        public String apply() {
            return "a";
        }

        @Override
        public boolean isSatisfiedBy(int number) {
            return true;
        }
    }

}
