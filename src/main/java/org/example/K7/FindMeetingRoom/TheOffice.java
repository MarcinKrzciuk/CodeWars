package org.example.K7.FindMeetingRoom;

public class TheOffice {
    public static Object meeting(char[] x) {
        int i = new String(x).indexOf('O');
        return i < 0 ? "None available!" : i;

    }
}
