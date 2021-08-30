package org.example.K7.alphabet_war;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kata {
    public static String alphabetWar(String fight){
        int resulLeft = 0;
        int resultRight = 0;
        String info = "Let's fight again!";

        List<Character> letters = new ArrayList<>();

        HashMap<Character, Integer> scoresLeft = new HashMap<>();
        scoresLeft.put('w', 4);
        scoresLeft.put('p', 3);
        scoresLeft.put('b', 2);
        scoresLeft.put('s', 1);

        HashMap<Character, Integer> scoresRight = new HashMap<>();
        scoresRight.put('m', 4);
        scoresRight.put('q', 3);
        scoresRight.put('d', 2);
        scoresRight.put('z', 1);

        for (int i = 0; i < fight.length(); i++) {
            letters.add(fight.charAt(i));
        }

        for (int i = 0; i < fight.length(); i++) {
            if (scoresLeft.containsKey(letters.get(i))) {
                resulLeft = resulLeft + scoresLeft.get(letters.get(i));
            }
        }

        for (int i = 0; i < fight.length(); i++) {
            if (scoresRight.containsKey(letters.get(i))) {
                resultRight = resultRight + scoresRight.get(letters.get(i));
            }
        }

        if (resulLeft > resultRight) {
            info = "Left side wins!";
        }
        if (resulLeft < resultRight) {
            info = "Right side wins!";
        }
        return info;
    }
}
