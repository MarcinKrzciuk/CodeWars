package org.example.K7.gcd;

import junit.framework.TestCase;

public class GreatestCommonDivisorTest extends TestCase {
    public void testGcd() {
        assertEquals(6, GCD.compute(30,12));
        assertEquals(1, GCD.compute(8,9));
        assertEquals(1, GCD.compute(1,1));
    }
}