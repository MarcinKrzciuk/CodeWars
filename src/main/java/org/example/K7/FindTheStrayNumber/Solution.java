package org.example.K7.FindTheStrayNumber;

import java.util.Arrays;

public class Solution {
    static int stray(int[] numbers) {
        int nr = 0;
        Arrays.sort(numbers);
        if (numbers[0] == numbers[1]) {
            nr = numbers[numbers.length - 1];
        } else {
            nr = numbers[0];
        }
        return nr;
    }
}
