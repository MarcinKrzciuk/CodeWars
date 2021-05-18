package org.example.K7.MyLanguages;

import java.util.*;

public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        ArrayList<String> myLanguages = new ArrayList<>();
        List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(results.entrySet());
        System.out.println(list);
        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));
        System.out.println(list);
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for (Map.Entry<String, Integer> exam : temp.entrySet()) {
            if (exam.getValue() > 59) {
                myLanguages.add(exam.getKey());
            }
        }
        Collections.reverse(myLanguages);
        return myLanguages;
    }
}
