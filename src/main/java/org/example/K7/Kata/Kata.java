package org.example.K7.Kata;

public class Kata {
    public static String plant(char seed, int water, int fert, int temp) {

        return 20 <= temp && temp <= 30 ? ("-".repeat(water) + Character.toString(seed)).repeat(fert).repeat(water) : "-".repeat(water * water) + seed;

    }
}
