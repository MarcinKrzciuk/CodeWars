package org.example.K7.FindMeetingRoom;

public class TheOffice {
    public static Object meeting(char[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O') {
                return i;
            }
        }

        for (int i = 0; i < x.length; i++) {
            if ((x[0] == x[i]) && (x[i] == 'X')) {
                return "None available!";
            }
        }

        return 0;
    }
}
