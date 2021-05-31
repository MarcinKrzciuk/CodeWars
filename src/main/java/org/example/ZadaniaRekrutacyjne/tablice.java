package org.example.ZadaniaRekrutacyjne;

//zamien pierwszy element tablicy z ostatnim

public class tablice {
    public static void main(String[] args) {
        int [] tab = {2,4,6,9,10};

        int pom = tab[0];
        tab[0] = tab[tab.length - 1];
        tab[tab.length - 1] = pom;

        for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
}
