package org.example.K6.fold_an_array;

public class Kata {
    public static int[] foldArray(int[] array, int runs) {
        if (runs == 0) {
            return array;
        }

        int[] tmp;
        if (array.length % 2 == 0) {
            tmp = new int[array.length / 2];
            for (int i = 0; i < array.length / 2; i++) {
                tmp[i] = array[i];
            }
        } else {
            tmp = new int[array.length / 2 + 1];
            for (int i = 0; i < array.length / 2 + 1; i++) {
                tmp[i] = array[i];
            }
        }

        for (int i = 0; i < array.length / 2; i++) {
            tmp[i] += array[array.length - i - 1];
        }
        return foldArray(tmp, runs - 1);

    }
}
