package org.example.K5.simple_string_expansion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals("ababab",Solution.solve("3(ab)"));
        assertEquals("abbbabbb",Solution.solve("2(a3(b))"));
        assertEquals("bccbccbcc",Solution.solve("3(b(2(c)))"));
        assertEquals("kabaccbaccbacc",Solution.solve("k(a3(b(a2(c))))"));
    }
}