package org.example;

import java.util.ArrayList;

public class App { public static void main(String[] args ) {

    int start = 125;
    int end = 132;

    int size = end - start + 1;
    int nr = start;
    ArrayList<String> help = new ArrayList<>();
    ArrayList<String> help1 = new ArrayList<>();
    for (int i = 0; i < size; i++) {
        help.add(String.valueOf(start));
        start++;
    };


    }
}
