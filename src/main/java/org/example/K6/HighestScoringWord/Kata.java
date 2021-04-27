package org.example.K6.HighestScoringWord;

//        Given a string of words, you need to find the highest scoring word.
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//        You need to return the highest scoring word as a string.
//        If two words score the same, return the word that appears earliest in the original string.
//        All letters will be lowercase and all inputs will be valid.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kata {

    private static final Map<Character, Integer> mymap = new HashMap<>();
    static {
        mymap.put('a', 1);
        mymap.put('b', 2);
        mymap.put('c', 3);
        mymap.put('d', 4);
        mymap.put('e', 5);
        mymap.put('f', 6);
        mymap.put('g', 7);
        mymap.put('h', 8);
        mymap.put('i', 9);
        mymap.put('j', 10);
        mymap.put('k', 11);
        mymap.put('l', 12);
        mymap.put('m', 13);
        mymap.put('n', 14);
        mymap.put('o', 15);
        mymap.put('p', 16);
        mymap.put('r', 17);
        mymap.put('s', 18);
        mymap.put('t', 19);
        mymap.put('u', 20);
        mymap.put('v', 21);
        mymap.put('w', 22);
        mymap.put('x', 23);
        mymap.put('y', 24);
        mymap.put('z', 25);
    }


    public static int score(String text) {

        int score = 0;

        for (int i = 0; i < text.length(); i++)  {
            score += mymap.get(text.charAt(i));
        }
        return score;
    }

    public static String high(String s) {
        String win = "";

        String[] split = s.split(" ");
        int max = score(split[0]);

        ArrayList<String> sorted = new ArrayList<>();

        for (int i = 0; i < split.length; i++) {
            if (score(split[i]) >= max) {
                max = score(split[i]);
                sorted.add(split[i]);
            }
        }


        for (int i = 0; i < sorted.size(); i++) {
            if (score(sorted.get(i)) == max) {
                win = sorted.get(i);
                break;
            }
        }
        return win;
    }
}
