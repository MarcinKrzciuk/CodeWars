package org.example.K7.SpecialNr;

public class Solution {
    public static String specialNumber(int number) {
        String test = "Special!!";

        int l = String.valueOf(number).length();

        for (int i = 0; i < l; i++) {
            if (number % 10 > 5) {
                test = "NOT!!";
            } else {
                number = number / 10;
            }
        }
        return test;
    }
}
