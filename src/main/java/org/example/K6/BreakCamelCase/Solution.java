package org.example.K6.BreakCamelCase;

public class Solution {
    public static String camelCase(String input) {

        return input.replaceAll("([A-Z])", " $1");
    }
}
