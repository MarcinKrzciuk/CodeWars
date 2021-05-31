package org.example.ZadaniaRekrutacyjne;

import java.util.Arrays;

public class sortowanietablicy {
    public static void main(String[] args) {
        int [] tab = {5,2,6,7,9};

        int min = tab[0];

        Arrays.sort(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
