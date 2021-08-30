package org.example.K7.split_in_parts;

import java.util.ArrayList;
import java.util.List;

public class InParts {
    public static String splitInParts(String s, int partLength) {
        StringBuilder text = new StringBuilder();

        List<Character> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i));
        }

        for (int i = partLength; i < result.size(); i++) {
            char ch = ' ';
            result.add(i, ch);
            i = i + partLength;
        }

        for (Character c : result) {
            text.append(c);
        }

        return text.toString();
    }
}
