package org.example.K7.LostNumber;


public class Kata {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
        }

        for (int i = 0; i < mixedArr.length; i++) {
            sum2 += mixedArr[i];
        }
        return sum1 - sum2;
    }
}
