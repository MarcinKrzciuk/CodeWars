package org.example.K7.Switch;

public class Switch {

    public static String switcheroo(String x){

        char[] chars = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (chars[i] == 'a') {
                chars[i] = 'b';
            } else {
                if (chars[i] == 'b') {
                    chars[i] = 'a';
                }
            }
        }

        return String.valueOf(chars);
    }
}
