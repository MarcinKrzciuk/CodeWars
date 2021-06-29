package org.example.K7.FormTheLargest;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static long maxNumber(long n) {

        String number = String.valueOf(n);
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < number.length(); i++){
            list.add(number.charAt(i));
        }
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder result = new StringBuilder(list.size());
        for (Character c : list) {
            result.append(c);
        }
        String output = result.toString();
        return Long.valueOf(output);
    }
}
