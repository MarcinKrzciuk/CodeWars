package org.example.K7.Kata;

//test to be checked
//solution ok, not passing test

import junit.framework.TestCase;

public class HarvestFestivalTest extends TestCase {
    public void sampleTests() {
        assertEquals("---,,,,,,,---,,,,,,,---,,,,,,,", Kata.plant(',', 3, 7, 25));
        assertEquals("-+", Kata.plant('+', 1, 3, 15));
        assertEquals("---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;", Kata.plant(';', 9, 10, 30));
    }

}