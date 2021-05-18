package org.example.K7.MostFrequent;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static int mostFrequentItemCount(int[] collection) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        for(int i = 0; i < collection.length; i++) {
            int key = collection[i];
            if (hp.containsKey(key)) {
                int freq = hp.get(key);
                freq++;
                hp.put(key, freq);
            } else {
                hp.put(key, 1);
            }
        }
        int max_count = 0, res = -1;

        for(Map.Entry<Integer, Integer> val : hp.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
            }
        }

        return max_count;

    }
}
