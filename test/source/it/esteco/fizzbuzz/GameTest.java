package it.esteco.fizzbuzz;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GameTest {

    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() throws Exception {
        outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @Test
    public void applyDefaultRuleIfNoRuleGiven() {
        Game game = new Game(Collections.emptyList());

        game.print(IntStream.of(3));

        assertThat(outputStream.toString(), is(equalTo("3\n")));
    }

    @Test
    public void applyDefaultRuleIfNoRuleIsSatisfied() {
        Game game = new Game(Collections.singletonList(new UnsatisfiableRule()));

        game.print(IntStream.of(4));

        assertThat(outputStream.toString(), is(equalTo("4\n")));
    }

    @Test
    public void applyFirstSatisfiedRule() {
        Game game = new Game(Arrays.asList(new UnsatisfiableRule(), new AlwaysSatisfiedRule(), new AlwaysSatisfiedRule()));

        game.print(IntStream.of(1));

        assertThat(outputStream.toString(), is(equalTo("a\n")));
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
