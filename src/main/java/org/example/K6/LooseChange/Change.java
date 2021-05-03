package org.example.K6.LooseChange;

//
//        Welcome young Jedi! In this Kata you must create a function that takes an amount of US currency in cents,
//        and returns a dictionary/hash which shows the least amount of coins used to make up that amount.
//        The only coin denominations considered in this exercise are: Pennies (1¢), Nickels (5¢), Dimes (10¢) and Quarters (25¢).
//        Therefor the dictionary returned should contain exactly 4 key/value pairs.
//
//        Notes:
//
//        If the function is passed either 0 or a negative number, the function should return the dictionary
//        with all values equal to 0.
//        If a float is passed into the function, its value should be be rounded down, and the resulting dictionary
//        should never contain fractions of a coin.



import java.util.HashMap;

public class Change {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        if (cent <= 0) {
            return map;
        }

        int pennies = 1;
        int nickeles = 5;
        int dimes = 10;
        int quarters = 25;

        quarters = cent / quarters;
        map.put("Quarters", quarters);
        cent = cent - quarters * 25;

        dimes = cent / dimes;
        map.put("Dimes", dimes);
        cent = cent - dimes * 10;

        nickeles = cent / nickeles;
        map.put("Nickels", nickeles);
        cent = cent - nickeles * 5;

        pennies = cent / pennies;
        map.put("Pennies", pennies);

        return map;
    }
}
