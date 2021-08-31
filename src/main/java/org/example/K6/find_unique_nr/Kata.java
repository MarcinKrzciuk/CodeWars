package org.example.K6.find_unique_nr;

import java.util.Arrays;

public class Kata {
    public static double findUniq(double arr[]) {
        double result = 0;
        Arrays.sort(arr);
        if (arr[0] == arr[1]) {
            result = arr[arr.length -1];
        } else {
            result = arr[0];
        }
        return result;
    }
}
