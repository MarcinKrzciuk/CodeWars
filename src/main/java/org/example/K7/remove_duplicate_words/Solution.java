package org.example.K7.remove_duplicate_words;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution{
    public static String removeDuplicateWords(String s){
        return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }
}