package org.example.K7.remove_duplicate_words;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution{
    public static String removeDuplicateWords(String s){
        String[] splited = s.split("\\s+");
        List<String> checked = Arrays.asList(splited);
        checked = checked.stream().distinct().collect(Collectors.toList());
        return String.join(" ", checked);
    }
}