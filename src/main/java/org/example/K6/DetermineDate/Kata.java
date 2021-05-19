package org.example.K6.DetermineDate;

public class Kata {
    public static String getDay(int day, boolean isLeap) {

        int[] days = {31, isLeap ? 29 : 28, 31,30,31,30,31,31,30,31,30,31};
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int i;
        for(i =0; i<12; i++){
            if(day <= days[i])
                break;
            day -= days[i];
        }
        return months[i] + ", " + day;
    }
}