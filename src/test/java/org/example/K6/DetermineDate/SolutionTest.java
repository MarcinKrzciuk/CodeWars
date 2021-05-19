package org.example.K6.DetermineDate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionTest {
    @Test
    void basicTest() {
        assertEquals("January, 15", Kata.getDay(15, false));
        assertEquals("February, 10", Kata.getDay(41, false));
        assertEquals("February, 28", Kata.getDay(59, false));
        assertEquals("March, 1", Kata.getDay(60, false));
        assertEquals("February, 29", Kata.getDay(60, true));
        assertEquals("December, 31", Kata.getDay(365, false));
        assertEquals("December, 31", Kata.getDay(366, true));
    }
}



