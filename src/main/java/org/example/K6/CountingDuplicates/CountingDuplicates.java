package org.example.K6.CountingDuplicates;


//  Write a function that will return the count of distinct case-insensitive alphabetic characters
//  and numeric digits that occur more than once in the input string.
//  The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text.toLowerCase();
        int howmany = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer, Integer> mymap = new HashMap<Integer, Integer>();

        for (int i = 0; i < text.length(); i++) {
            int temp = text.charAt(i);
            list.add(temp);
        }

        for (int i = 0; i < list.size(); i++) {
            int key = list.get(i);

            if (mymap.containsKey(key)) {
                int count = mymap.get(key);
                count++;
                mymap.put(key, count);
            } else {
                mymap.put(key, 1);
            }
        }

        for (Map.Entry<Integer, Integer> val : mymap.entrySet()) {
            if (val.getValue() > 1) {
                howmany++;
            }
        }

        return howmany;
    }
}
