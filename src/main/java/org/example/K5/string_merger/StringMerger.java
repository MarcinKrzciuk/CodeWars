package org.example.K5.string_merger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        List<Character> list1 = new ArrayList<>();
        for (char ch: s.toCharArray()) {
            list1.add(ch);
        }

        List<Character> list2 = new ArrayList<>();
        for (char ch: part1.toCharArray()) {
            list2.add(ch);
        }
        for (char ch: part2.toCharArray()) {
            list2.add(ch);
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2) ? true : false;
    }
}
