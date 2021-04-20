package org.example.K7.Kata;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals("---,,,,,,,---,,,,,,,---,,,,,,,", Kata.plant(',', 3, 7, 25));
        assertEquals("-+", Kata.plant('+', 1, 3, 15));
        assertEquals("---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;", Kata.plant(';', 9, 10, 30));
    }

}