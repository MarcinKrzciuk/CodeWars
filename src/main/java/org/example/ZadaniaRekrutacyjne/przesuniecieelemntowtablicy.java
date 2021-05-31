package org.example.ZadaniaRekrutacyjne;

public class przesuniecieelemntowtablicy {
    public static void main(String[] args) {
        int [] tab = {2,4,6,7,8,10};

        int pom = tab[0];

        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = tab[i+1];
        }
        tab[tab.length - 1 ] = pom;

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

    }
}
