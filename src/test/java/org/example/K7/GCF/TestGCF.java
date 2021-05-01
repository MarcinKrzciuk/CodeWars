package org.example.K7.GCF;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGCF
{
    @Test
    public void basicTests()
    {
        assertEquals(Kata.findGCF(8,20), 4);
        assertEquals(Kata.findGCF(5,13), 1);
        assertEquals(Kata.findGCF(100,100), 100);
    }
}