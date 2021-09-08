package org.example.K6.convert_string_to_camel_case;

public class Solution {
    static String toCamelCase(String s){
        String regex = "-";

        if (s.contains("_")) {
            regex = "_";
        }
        String[] split = s.split(regex);

        for (int i = 1; i < split.length; i++) {
            split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1).toLowerCase();
        }

        return String.join("", split);
    }
}
