package org.example.K5.HumanReadableTime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int p1 = seconds % 60;
        int p2 = seconds / 60;
        int p3 = p2 % 60;
        p2 = p2 / 60;

        String res = String.format("%02d:%02d:%02d", p2, p3, p1);
        return res;
    }
}
