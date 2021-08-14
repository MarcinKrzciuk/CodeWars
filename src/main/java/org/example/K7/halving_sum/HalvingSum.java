package org.example.K7.halving_sum;

public class HalvingSum {
    int halvingSum(int n) {

        int result = n;

        while (n !=0 ) {
            n = n / 2;
            result = result + n;
        }
        return result;
    }
}
