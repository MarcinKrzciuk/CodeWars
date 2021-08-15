package org.example.K7.unlucky_days;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kata {
    public static int unluckyDays(int year) {

        String dateString = "01/13/" + year;
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        int counter = 0;
        int month = 0;

        while (month++ <= 12) {
            if (Calendar.FRIDAY == cal.get(Calendar.DAY_OF_WEEK)) {
                counter++;
            }
            cal.add(Calendar.MONTH,1);
        }
        return counter;
    }
}
