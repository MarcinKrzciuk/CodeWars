package org.example.K7.oddOrEvenArray;

import java.util.Arrays;
//
//        Given a list of integers, determine whether the sum of its elements is odd or even.
//        Give your answer as a string matching "odd" or "even".
//        If the input array is empty consider it as: [0] (array with a zero).

public class Codewars {
    public static String oddOrEven (int[] array) {

        return Arrays.stream(array).sum() %2 == 0 ? "even" : "odd";

    }
}
