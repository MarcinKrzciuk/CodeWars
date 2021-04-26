package org.example.K7.VowelCount;

import java.util.ArrayList;

public class Vowels {
    public static int getCount(String str) {
        int count = 0;
        String[] split = str.split("");
        ArrayList<String> letter = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            letter.add(split[i]);
        }
        System.out.println(letter);

        for (int i = 0; i < letter.size(); i++) {
            if (letter.get(i).equals("a")) {
                count++;
            }
            if (letter.get(i).equals("e")) {
                count++;
            }
            if (letter.get(i).equals("i")) {
                count++;
            }
            if (letter.get(i).equals("o")) {
                count++;
            }
            if (letter.get(i).equals("u")) {
                count++;
            }
        }
        return count;
    }
}
