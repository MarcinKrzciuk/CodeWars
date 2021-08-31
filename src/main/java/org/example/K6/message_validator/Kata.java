package org.example.K6.message_validator;

public class Kata {
    public static boolean isAValidMessage(String message) {
        int count = 0;
        boolean check = false;

        String[] text = message.split("(?=\\d)(?<!\\d)");
        int[] length = new int[text.length];

        if (message.equals("")) {
            check = true;
        }

        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceAll("[^0-9]", "");
            if (text[i].length() > 0) {
                length[i] = Integer.valueOf(text[i]);
                System.out.println(length[i]);
            }
        }

        text = message.split("(?=\\d)(?<!\\d)");
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceAll("\\d", "");
            System.out.println(text[i]);
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
