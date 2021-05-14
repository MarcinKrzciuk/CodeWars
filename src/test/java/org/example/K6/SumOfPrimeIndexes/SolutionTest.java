package org.example.K6.SumOfPrimeIndexes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest{
    @Test
    public void basicTests(){
        assertEquals(0,Solution.solve(new int [] {}));
        assertEquals(7,Solution.solve(new int [] {1,2,3,4}));
        assertEquals(13,Solution.solve(new int [] {1,2,3,4,5,6}));
        assertEquals(47,Solution.solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }
}