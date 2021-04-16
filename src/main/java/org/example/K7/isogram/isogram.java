package org.example.K7.isogram;


public class isogram {
    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
