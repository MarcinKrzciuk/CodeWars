package org.example.K5.simple_string_expansion;

public class Solution {
    public static String solve(String s) {
        String result = "";

        for (char ch : new StringBuilder(s).reverse().toString().toCharArray()) {
            if(Character.isDigit(ch)) result = result.repeat(Integer.parseInt(ch + ""));
            if(Character.isLetter(ch)) result = ch + result;
        }
        return result;
    }
}
