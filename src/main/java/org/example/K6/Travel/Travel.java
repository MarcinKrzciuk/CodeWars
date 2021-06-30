package org.example.K6.Travel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Travel {
    public static String travel(String r, String zipcode) {
        String test1;
        String test2;
        String end;
        List<String> list = Arrays.asList(r.split(","));
        List<String> list2 = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(zipcode)) {
                test1 = list.get(i).replaceAll(zipcode, "");
                test2 = test1.replaceAll("\\s.*", "");
                list2.add(test2);
                test1 = test1.replace(test2,"").trim();
                str.append(test1 + ",");
            }
        }

        str.setLength(str.length() - 1);
        str.append("/");

        for (int i = 0; i < list2.size(); i++) {
            str.append(list2.get(i) + ",");
        }
        str.setLength(str.length() - 1);

        end = zipcode + ":" + String.valueOf(str);
        return end;
    }
}
