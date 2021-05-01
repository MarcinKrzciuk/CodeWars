package org.example.K7.CounttheDigit;


public class CountDig {
    public static int nbDig(int n, int d) {

            int c = 0;
            for (int i = 0; i < n + 1; i++) {
                int temp = i * i;
                while (true) {
                    if (temp % 10 == d)
                        c++;
                    if ((temp /= 10) == 0)
                        break;
                }
            }
        return c;
    }
}