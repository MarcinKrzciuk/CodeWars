package org.example.K7.SuitcasePacking;

//Mr. Square is going on a holiday. He wants to bring 2 of his favorite squares with him, so he put them in his rectangle suitcase.
//Write a function that, given the size of the squares and the suitcase, return whether the squares can fit inside the suitcase.

public class MrSquare {
    public static Boolean fit_in(int a, int b, int m, int n) {

        int small = n < m ? n : m;
        int longer = n > m ? n : m;

        if (a > small || b > small) {
            return false;
        } else if
        (a + b > longer) {
            return false;
        }
        return true;
    }
}
