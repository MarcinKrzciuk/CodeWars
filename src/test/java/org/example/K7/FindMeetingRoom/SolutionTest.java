package org.example.K7.FindMeetingRoom;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basic1() {
        assertEquals(1, TheOffice.meeting(new char[] {'X', 'O', 'X'}));
    }

    @Test
    public void basic2() {
        assertEquals(0, TheOffice.meeting(new char[] {'O','X','X','X','X'}));
    }

    @Test
    public void basic3() {
        assertEquals(2, TheOffice.meeting(new char[] {'X','X','O','X','X'}));
    }

    @Test
    public void basic4() {
        assertEquals("None available!", TheOffice.meeting(new char[] {'X','X','X','X','X'}));
    }
}