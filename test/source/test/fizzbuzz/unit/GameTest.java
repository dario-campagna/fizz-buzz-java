package test.fizzbuzz.unit;

import kata.fizzbuzz.Game;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GameTest {

    @Test
    public void sameNumber() {
        Game game = new Game();
        assertThat(game.convert(1), is(equalTo("1")));
    }
}
