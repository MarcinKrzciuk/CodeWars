package org.example.K7.SuitcasePacking;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSuitcase  {
    @Test
    public void fixed_test() {
        assertEquals(true, MrSquare.fit_in(1, 2, 3, 2));
        assertEquals(false, MrSquare.fit_in(1, 2, 2, 1));
        assertEquals(false, MrSquare.fit_in(3, 2, 3, 2));
        assertEquals(false, MrSquare.fit_in(1, 2, 1, 2));
        assertEquals(false, MrSquare.fit_in(6, 5, 8, 7));
    }
}