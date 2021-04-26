package org.example.K7.HighestAndLowest;

//        In this little assignment you are given a string of space separated numbers,
//        and have to return the highest and lowest number.
//
//        Example:
//        highAndLow("1 2 3 4 5")  // return "5 1"

import java.util.ArrayList;

public class Kata {
    public static String highAndLow(String numbers) {// Code here or

        String [] txt = numbers.split(" ");
        ArrayList<Integer> nr = new ArrayList<>();

        for (int i = 0; i < txt.length; i++ ){
            nr.add(Integer.valueOf(txt[i]));
        }
        int min = nr.get(0);
        int max = nr.get(0);

        for (int i = 0; i < nr.size(); i++) {

            if (nr.get(i) < min) {
                min = nr.get(i);
            }

            if (nr.get(i) > max) {
                max = nr.get(i);
            }
        }
        return String.valueOf(max) + " " + String.valueOf(min);
    }
}
