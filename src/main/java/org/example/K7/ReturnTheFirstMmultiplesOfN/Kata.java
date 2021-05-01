package org.example.K7.ReturnTheFirstMmultiplesOfN;

public class Kata {
    public static int[] multiples(int m, int n) {

        int index = 0;
        int[] nr = new int[m];

        for (int i = 1; i <= nr.length; i++) {
            nr[index] = n * i;
            index++;
        }
        return nr;
    }
}
