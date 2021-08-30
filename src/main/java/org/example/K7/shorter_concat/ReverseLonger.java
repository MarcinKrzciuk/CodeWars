package org.example.K7.shorter_concat;

public class ReverseLonger {
    public static String shorterReverseLonger(String a, String b) {

        String help;

        if (b.length() > a.length()) {
            help = b;
            b = a;
            a = help;
        }

        StringBuilder text1 = new StringBuilder(a);
        text1 = text1.reverse();

        StringBuilder result = new StringBuilder();
        result = result.append(b).append(text1).append(b);

        return result.toString();

    }
}
