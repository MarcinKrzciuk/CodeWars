package org.example;

import java.text.ParseException;
import java.util.*;

public class App {

    public static void main(String[] args) throws ParseException {

        int[] array = new int[]{1, 2, 3, 4, 5};
        int runs = 1;

        List<Integer> result = new ArrayList<>();

        int middle = array.length / 2;
        System.out.println(middle);

        if (array.length % 2 != 0) {
            for (int i = 0; i < middle; i++) {
                if (i < middle) {
                    result.add(array[i] + array[array.length - 1 - i]);
                }
            }
            runs--;
            result.add(array[middle]);
        }



        System.out.println(result);

    }
}