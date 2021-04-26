package org.example.K6.Persist;

//        Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
//        which is the number of times you must multiply the digits in num until you reach a single digit.
//
//        For example: persistence(39) == 3 because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit

public class Persist {
    public static int persistence(long n) {

        if (n < 10)
            return 0;

        long num = 1;
        while (n != 0) {
            num *= (n % 10);
            n /= 10;
        }
        return 1 + persistence(num);

    }
}

