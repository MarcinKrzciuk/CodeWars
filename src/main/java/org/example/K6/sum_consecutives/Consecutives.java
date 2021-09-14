package org.example.K6.sum_consecutives;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        int current = s.get(0);
        int count = 1;
        List<Integer> result = new ArrayList<>();

        for (Integer i: s.subList(1, s.size())){
            if (current == i){
                count++;
            } else {
                result.add(current * count);
                current = i;
                count = 1;
            }
        }

        result.add(current * count);

        return result;
    }
}
