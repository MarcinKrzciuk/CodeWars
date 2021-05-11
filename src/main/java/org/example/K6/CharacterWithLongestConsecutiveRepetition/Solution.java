package org.example.K6.CharacterWithLongestConsecutiveRepetition;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    public static Object[] longestRepetition(String s) {

        if (s.length() == 0) {
            return new Object[]{"", 0};
        }

        List<Character> list = s.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        Map<Character, Long> counts = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        Map.Entry<Character, Long> max = null;
        for(Map.Entry<Character, Long> price: counts.entrySet()) {
            if (max == null || price.getValue().compareTo(max.getValue()) > 0) {
                max = price;
            }
        }

        return new Object[]{max.getKey().toString(), Math.toIntExact(max.getValue())};
    }
}
