package org.example.K7.Dinglemouse;

public class Dinglemouse {
    public static int[] paintLetterboxes(final int start, final int end) {

       int size = end - start + 1;
       int nr = start;
       int[] help = new int[size];

        for (int i = 0; i <= size; i++) {
            nr++;
            help[i] = nr;
        }

        return new int[10];
    }
}
