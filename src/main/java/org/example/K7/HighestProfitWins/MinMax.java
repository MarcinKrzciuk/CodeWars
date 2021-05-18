package org.example.K7.HighestProfitWins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class MinMax {
    public static int[] minMax(int[] arr) {
        ArrayList<Integer> integerArray = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        return  new int[] {Collections.min(integerArray),Collections.max(integerArray)};
    }
}
