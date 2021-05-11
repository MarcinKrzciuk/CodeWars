package org.example.K7.SortOutTheMenFromBoys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int[] menFromBoys(final int[] values) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < values.length; i++) {
            if (values[i] %2 == 0) {
                list.add(values[i]);
            } else if (values[i] %2 != 0){
                list1.add(values[i]);
            }
        }
        Collections.sort(list);
        Collections.sort(list1, Collections.reverseOrder());
        list.addAll(list1);
        List<Integer> newList = list.stream().distinct().collect(Collectors.toList());

        return newList.stream().mapToInt(i -> i).toArray();
    }
}
