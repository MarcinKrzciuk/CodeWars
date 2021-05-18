package org.example.K7.MyLanguages;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        ArrayList<String> myLanguages = new ArrayList<>();
        for (Map.Entry<String, Integer> exam : results.entrySet()) {
            if (exam.getValue() >= 60) {
                myLanguages.add(exam.getKey());
            }
        }
        return myLanguages;
    }
}
