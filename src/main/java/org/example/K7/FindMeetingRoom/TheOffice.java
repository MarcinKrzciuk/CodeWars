package org.example.K7.FindMeetingRoom;

public class TheOffice {
    public static Object meeting(char[] x) {
        char busy = 'X';
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'X') {
                return "None available!";
            }
        }



        return "I'm not sure";
    }
}
