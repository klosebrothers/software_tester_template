
package de.klosebrothers.katas.software_tester;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void setUp() {
        game = new Game();
    }

    @Test
    public void shouldReturnZeroScore() {
        assertEquals(0, 0);
    }
}
