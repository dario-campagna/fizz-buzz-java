package it.esteco.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.print(1);
        assertThat(outputStream.toString(), is(equalTo("1\n")));
    }
}
