package org.example.K7.solution;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void simpleArray1() {
        assertEquals(2, getActualFor(1, 1, 2));
    }

    private int getActualFor(int... numbers) {
        return Solution.stray(numbers);
    }
}