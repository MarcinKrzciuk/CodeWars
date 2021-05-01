package org.example.K7.ReturnTheFirstMmultiplesOfN;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class ExampleKataTests {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {5, 10, 15}, Kata.multiples(3, 5));
    }
}