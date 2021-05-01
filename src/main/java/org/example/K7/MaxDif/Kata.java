package org.example.K7.MaxDif;

import java.util.Arrays;

public class Kata {
    public static int maxDiff(int[] lst) {

        return lst.length <= 1 ? 0 : Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
    }
}
