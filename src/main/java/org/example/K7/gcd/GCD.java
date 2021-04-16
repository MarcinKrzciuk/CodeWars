package org.example.K7.gcd;

//finding biggest divider for 2 int numbers

public class GCD {
    public static int compute(int x, int y) {
        int a = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x %i == 0 && y %i == 0) {
                a = i;
            }
        }
        return a;
    }
}
