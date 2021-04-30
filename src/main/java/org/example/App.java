package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int n = 25;
        int d = 1;
        String check = String.valueOf(d);

        int count = 0;

        ArrayList<Integer> nr = new ArrayList<>();
        ArrayList<String> nr1 = new ArrayList<>();

        for (int i = 0; i <= n; i++){
            nr.add(i);
        }

        System.out.println(nr);

        for (int i = 0; i < nr.size(); i++){
            nr.set(i, nr.get(i) * nr.get(i));
            nr1.add(nr.get(i).toString());
        }

        System.out.println(nr1);

        for (int i = 0; i < nr1.size(); i++) {
            if (nr1.get(i).contains(check)) {
               for (int j = 0; j < nr1.get(i).length(); j++) {

               }
            }

        }

        System.out.println(count);

    }
}





