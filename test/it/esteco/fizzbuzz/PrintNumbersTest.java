package it.esteco.fizzbuzz;

import org.junit.Before;
import org.junit.Ignore;
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
    public void printOne() {
        FizzBuzz fizzBuzz = new FizzBuzz(new DefaultRule());

        fizzBuzz.print(IntStream.of(1));

        assertThat(outputStream.toString(), is(equalTo("1\n")));
    }

    @Test
    public void printFizzInsteadOfThree() {
        FizzBuzz fizzBuzz = new FizzBuzz(new FizzRule());

        fizzBuzz.print(IntStream.of(3));

        assertThat(outputStream.toString(), is(equalTo("Fizz\n")));
    }

    @Test@Ignore
    public void printOneTwoFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz(null);

        fizzBuzz.print(IntStream.rangeClosed(1,3));

        assertThat(outputStream.toString(), is(equalTo("1\n2\nFizz\n")));
    }
}
