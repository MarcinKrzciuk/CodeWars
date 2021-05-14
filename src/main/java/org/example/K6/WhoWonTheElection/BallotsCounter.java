package org.example.K6.WhoWonTheElection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BallotsCounter {
    public static String getWinner(final List<String> listOfBallots) {
        Map<String,Integer> map = new HashMap<>();

        for (String str : listOfBallots) {
            if (map.keySet().contains(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }

        int maxValueInMap = 0;
        String winner = "";

        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap) {
                maxValueInMap = val;
                winner = key;
            }
        }


        return (maxValueInMap > listOfBallots.size()/2 ? winner : null);
    }
}
