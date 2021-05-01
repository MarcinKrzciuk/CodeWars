package org.example.K7.GCF;

public class Kata {
    public static int findGCF(int num1, int num2) {
        int max = 1;
        for (int i = 1; i <= (num1 > num2 ? num2 : num1); i++) {
            if ((num1 %i == 0) && (num2 %i == 0)) {
                max = i;
            }
        }
        return max;
    }
}
