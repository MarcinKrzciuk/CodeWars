package org.example.K7.two_to_one;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        String s3 = s1 + s2;
        return Arrays.stream(s3.split("")).distinct().sorted().collect(Collectors.joining());
    }
}
