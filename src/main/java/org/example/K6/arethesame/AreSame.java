package org.example.K6.arethesame;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        boolean test = false;

        int[] check = new int [a.length];

        for (int i = 0; i < check.length; i++) {
            if (a[i] * a[i] == b[i]) {
                test = true;
            }
        }
        return test;
    }
}
