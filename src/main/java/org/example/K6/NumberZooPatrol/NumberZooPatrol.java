package org.example.K6.NumberZooPatrol;

import java.util.Arrays;

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {

        int total = 1;
        for (int i = 2; i <= (numbers.length + 1); i++) {
            total += i;
            total -= numbers[i - 2];
        }
        return total;
    }
}
