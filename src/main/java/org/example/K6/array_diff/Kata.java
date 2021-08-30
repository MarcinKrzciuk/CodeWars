package org.example.K6.array_diff;
import org.apache.commons.lang3.ArrayUtils;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {

        for (int i = 0; i < b.length; i++)
            a = ArrayUtils.removeAllOccurences(a, b[i]);
        return a;
        }
    }

