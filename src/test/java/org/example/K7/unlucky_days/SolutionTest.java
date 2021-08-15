package org.example.K7.unlucky_days;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals(3, Kata.unluckyDays(2015));
        assertEquals(1, Kata.unluckyDays(1986));
    }
}