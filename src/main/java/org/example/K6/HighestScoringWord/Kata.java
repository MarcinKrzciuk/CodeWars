package org.example.K6.HighestScoringWord;

//        Given a string of words, you need to find the highest scoring word.
//        Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//        You need to return the highest scoring word as a string.
//        If two words score the same, return the word that appears earliest in the original string.
//        All letters will be lowercase and all inputs will be valid.

import java.util.Arrays;

public class Kata {

    public static int score(String text) {

        int score = 0;

        for (int i = 0; i < text.length(); i++)  {
            score += text.charAt(i);
        }
        return score;
    }

    public static String high(String s) {

        int max = 0;
        String win = "";

        String [] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (score(split[i]) > max) {
                max = score(split[i]);
                win = split[i];
            }
        }
        return win;
    }
}
