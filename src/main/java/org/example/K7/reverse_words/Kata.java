package org.example.K7.reverse_words;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static String reverseWords(final String original) {
        String[] separated = original.split(" ");
        List<String> finish = new ArrayList<>();

        for (int i = 0; i < separated.length; i++) {
            finish.add(new StringBuilder(separated[i]).reverse().toString());
        }

        System.out.println(finish);

        StringBuilder sb = new StringBuilder();
        for (String s : finish)
        {
            sb.append(s);
            sb.append(" ");
        }

        return sb.toString().replaceAll("\\s+$", "");
    }
}
