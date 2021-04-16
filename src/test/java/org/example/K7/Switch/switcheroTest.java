package org.example.K7.Switch;

import junit.framework.TestCase;

public class switcheroTest extends TestCase {
    public void testSomething() {
        assertEquals("abc",Switch.switcheroo( "bac"));
        assertEquals("ccc",Switch.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",Switch.switcheroo("bbbacccabbb"));
    }

}