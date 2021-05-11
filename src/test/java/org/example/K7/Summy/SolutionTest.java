package org.example.K7.Summy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(Summation.summy("1 2 3"), 6);
        assertEquals(Summation.summy("1 2 3 4"), 10);
        assertEquals(Summation.summy("1 2 3 4 5"), 15);
        assertEquals(Summation.summy("10 10"), 20);
        assertEquals(Summation.summy("0 0"), 0);
    }
}