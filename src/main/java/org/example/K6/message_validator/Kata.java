package org.example.K6.message_validator;

public class Kata {
    public static boolean isAValidMessage(String message) {
        int count = 0;
        boolean check = false;

        if (message.isEmpty()) {
            check = true;
        }

        String[] text = message.split("(?=\\d)(?<!\\d)");
        int[] length = new int[text.length];

        for (int i = 0; i < text.length; i++) {
            length[i] = Integer.parseInt(text[i].replaceAll("[^0-9]", ""));
        }

        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceAll("\\d", "");
        }

        for (int i = 0; i < text.length; i++) {
            if (length[i] == text[i].length()) {
                count++;
            }
        }

        if (count == text.length) {
            check = true;
        }
        if (count != text.length) {
            check = false;
        }


        return check;
    }
}
