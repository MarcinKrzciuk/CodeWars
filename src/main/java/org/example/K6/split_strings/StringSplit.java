package org.example.K6.split_strings;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {
        String[] split = s.split("(?!^)");

        List<String> result = new ArrayList<>();

        if (s.length() % 2 == 0) {
            for (int i = 0; i < split.length - 1; i += 2) {
                result.add(split[i] + split[i + 1]);
            }
        } else {
            for (int i = 0; i < split.length - 1; i += 2) {
                result.add(split[i] + split[i + 1]);
            }
            result.add(split[split.length - 1] + "_");
        }
        return result.toArray(new String[0]);
    }
}
