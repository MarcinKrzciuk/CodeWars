package org.example.K7.CreditCardMask;

public class Maskify {
    public static String maskify(String str) {
        if (str.length() < 5) {
            return str;
        }
        String result = "";
        for (int i = 0; i < str.length()-4; i++) {
            result += "#";
        }
        return result + str.substring(str.length()-4);

    }
}
