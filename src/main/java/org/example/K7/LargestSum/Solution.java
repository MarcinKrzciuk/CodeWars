package org.example.K7.LargestSum;


import java.util.Arrays;

public class Solution {
    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);

        return  numbers[numbers.length -1] + numbers[numbers.length -2];
    }
}
