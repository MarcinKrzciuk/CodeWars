package org.example.K7.LargestSum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static int largestPairSum(int[] numbers){
        List<Integer> intList = new ArrayList<>(numbers.length);
        for (int i : numbers) {
            intList.add(i);
        }
        Collections.sort(intList);

        return  intList.get(numbers.length -1) + intList.get(numbers.length -2);
    }
}
