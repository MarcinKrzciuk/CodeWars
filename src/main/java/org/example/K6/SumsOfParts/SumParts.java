package org.example.K6.SumsOfParts;

//        Let us consider this example (array written in general format):
//
//        ls = [0, 1, 3, 6, 10]
//
//        Its following parts:
//
//        ls = [0, 1, 3, 6, 10]
//        ls = [1, 3, 6, 10]
//        ls = [3, 6, 10]
//        ls = [6, 10]
//        ls = [10]
//        ls = []
//        The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
//
//        The function parts_sums (or its variants in other languages) will take as parameter a list ls
//        and return a list of the sums of its parts as defined above.
//
//        Other Examples:
//
//        ls = [1, 2, 3, 4, 5, 6]
//        parts_sums(ls) -> [21, 20, 18, 15, 11, 6, 0]


import java.util.ArrayList;

public class SumParts {
    public static int[] sumParts(int[] ls) {

        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < ls.length; i++) {
            sum += ls[i];
        }
        list.add(sum);

        for (int i = 0; i < ls.length; i++) {
            sum = sum - ls[i];
            list.add(sum);
        }

        int[] arr = list.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
