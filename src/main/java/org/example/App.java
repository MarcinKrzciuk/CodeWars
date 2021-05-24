package org.example;


import java.text.ParseException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws ParseException {
//        int [] array = new int[]{1,11,3,9};
//        ArrayList<String> list = new ArrayList<>();
//
//        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//        String[] twodigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
//        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
//        String[] poweroftens = new String[] {"Hundred", "Thousand"};
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 10) {
//                list.add(onedigit[array[i]]);
//            }
//        }
//
//        System.out.println(list);

        int num = 999;
        int h;
        ArrayList<Integer> list = new ArrayList<>();
        String nr = String.valueOf(num);
//        for (int i = 0; i < nr.length(); i++) {
//            h = num % 10;
//            System.out.println(h);
//        }

        h = num % 100;
        System.out.println(h);
        num = num - h;

        h = num % 100;
        System.out.println(h);
        num = num - h;

        h = num % 100;
        System.out.println(h);
        num = num - h;
    }
}





