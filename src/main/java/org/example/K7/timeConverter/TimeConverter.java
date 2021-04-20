package org.example.K7.timeConverter;

public class TimeConverter {

    public static String toTime(int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;

        String txt = String.format(hours + " hour(s) and "+minutes+" minute(s)");

        return txt;

    }
}
