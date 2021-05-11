package org.example.K6.CharacterWithLongestConsecutiveRepetition;


public class Solution {
    public static Object[] longestRepetition(String s) {

        if (s.length() == 0) {
            return new Object[]{"", 0};
        }

        int count = 0;
        char res = s.charAt(0);

        for (int i=0; i<s.length(); i++) {
            int cur_count = 1;
            for (int j=i+1; j<s.length(); j++) {
                if (s.charAt(i) != s.charAt(j))
                break;
                cur_count++;
            }

            if (cur_count > count) {
                count = cur_count;
                res = s.charAt(i);
            }
        }

        return new Object[]{Character.toString(res), count};
    }
}
