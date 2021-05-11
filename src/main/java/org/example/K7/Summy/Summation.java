package org.example.K7.Summy;

import java.util.Arrays;

public class Summation {
    static long summy(String stringOfInts) {

        long summy = 0;
        int[] result = Arrays.stream(stringOfInts.split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < result.length; i++) {
            summy += result[i];
        }
        return summy;
    }
}
