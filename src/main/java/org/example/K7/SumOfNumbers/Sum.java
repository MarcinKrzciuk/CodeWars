package org.example.K7.SumOfNumbers;

public class Sum {
    public int GetSum(int a, int b) {
        int res = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            res += i;
        }
        return a == b ? a : res;

    }
}
