package org.example.K6.SumOfPrimeIndexes;

public class Solution {

    private static boolean isPrime(int a) {
        if (a < 2) return false;
        if (a == 2) return true;
        if (a % 2 == 0) return false;

        for (int i = 3; i * i <= a; i += 2)
            if (a % i == 0) return false;
        return true;
    }

    public static int solve(int [] arr){

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            if(isPrime(i)) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
