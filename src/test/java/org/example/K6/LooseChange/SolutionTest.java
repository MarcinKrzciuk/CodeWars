package org.example.K6.LooseChange;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;

public class SolutionTest {
    @Test
    public void sampleTest() {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 4);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 1);
        assertEquals(map, Change.looseChange(29));

        map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        assertEquals(map, Change.looseChange(0));

        map = new HashMap<>();
        map.put("Pennies", 1);
        map.put("Nickels", 1);
        map.put("Dimes", 1);
        map.put("Quarters", 3);
        assertEquals(map, Change.looseChange(91));

        map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        assertEquals(map, Change.looseChange(-2));
    }
}