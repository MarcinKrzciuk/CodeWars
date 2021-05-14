package org.example.K6.MaketheDeadfishSwim;

import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {

        int nr = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'i') {
                nr++;
            }
            if (data.charAt(i) == 'd') {
                nr--;
            }
            if (data.charAt(i) == 's') {
                nr = nr * nr;
            }
            if (data.charAt(i) == 'o') {
                result.add(nr);
            }
        }

        int[] array = new int[result.size()];

        for(int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }

        return array;
    }
}
