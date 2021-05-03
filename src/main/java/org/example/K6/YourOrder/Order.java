package org.example.K6.YourOrder;

import java.util.Arrays;
import java.util.List;

public class Order {
    public static String order(String words) {

        List<String> list = Arrays.asList(words.split(" "));
        String [] list1 = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("1") == true) {
                list1[0] = list.get(i);
            }
            if (list.get(i).contains("2") == true) {
                list1[1] = list.get(i);
            }
            if (list.get(i).contains("3") == true) {
                list1[2] = list.get(i);
            }
            if (list.get(i).contains("4") == true) {
                list1[3] = list.get(i);
            }
            if (list.get(i).contains("5") == true) {
                list1[4] = list.get(i);
            }
            if (list.get(i).contains("6") == true) {
                list1[5] = list.get(i);
            }
            if (list.get(i).contains("7") == true) {
                list1[6] = list.get(i);
            }
            if (list.get(i).contains("8") == true) {
                list1[7] = list.get(i);
            }
            if (list.get(i).contains("9") == true) {
                list1[8] = list.get(i);
            }

        }

        return words.isEmpty() ? "" : String.join(" ", list1);
    }
}
