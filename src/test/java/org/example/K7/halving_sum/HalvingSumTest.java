package org.example.K7.halving_sum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HalvingSumTest {
    @Test
    public void test() {
        HalvingSum hs = new HalvingSum();
        assertEquals(47,hs.halvingSum(25));
        assertEquals(247,hs.halvingSum(127));
    }
}