package org.example.K7.SimpleStringReversal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals("srawedoc",Solution.solve("codewars"));
        assertEquals("edoc ruoy",Solution.solve("your code"));
        assertEquals("skco redo cruoy",Solution.solve("your code rocks"));
    }
}

