package org.example.K7.repeater;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("aaaaa",Repeater.repeat("a",5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa",Repeater.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ",Repeater.repeat("Wub ", 6));
    }
}