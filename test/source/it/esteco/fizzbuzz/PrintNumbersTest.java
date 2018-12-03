package it.esteco.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PrintNumbersTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setUp() throws Exception {
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
    }

    @Test
    public void printOneToFifteenWithFizzBuzz() {
        GameFactory.createFizzBuzz().print(IntStream.rangeClosed(1,15));

        assertThat(outputStream.toString(), is(equalTo("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n")));
    }

    @Test
    public void printThirtyToThirtyFiveWithFizzBuzzBang() {
        GameFactory.createFizzBuzzBang().print(IntStream.rangeClosed(30,35));

        assertThat(outputStream.toString(), is(equalTo("FizzBuzz\n31\n32\nFizz\n34\nBuzzBang\n")));
    }

    @Test
    public void printOneHundredToOneHundredAndFiveWithFizzBuzzBang() {
        GameFactory.createFizzBuzzBang().print(IntStream.rangeClosed(100,105));

        assertThat(outputStream.toString(), is(equalTo("Buzz\n101\nFizz\n103\n104\nFizzBuzzBang\n")));
    }
}
