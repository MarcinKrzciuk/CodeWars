package org.example.K6.WhichAreIn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {

        ArrayList<String> r = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].contains(array1[j])) {
                    set.add(array1[j]);
                }
            }
        }

        r.addAll(set);
        Collections.sort(r, String.CASE_INSENSITIVE_ORDER);
        String[] inArray = new String[r.size()];
        for (int i = 0; i < inArray.length; i++) {
            inArray[i] = r.get(i);
        }

        return inArray;
    }
}
