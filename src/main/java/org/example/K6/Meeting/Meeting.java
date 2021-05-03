
//        John has invited some friends. His list is:
//        s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
//        Could you make a program that
//
//        makes this string uppercase
//        gives it sorted in alphabetical order by last name.
//        When the last names are the same, sort them by first name. Last name and first name of a guest come in the result between parentheses separated by a comma.
//
//        So the result of function meeting(s) will be:
//
//        "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
//        It can happen that in two distinct families with the same family name two people have the same first name too.

package org.example.K6.Meeting;
import java.util.*;

public class Meeting {
    public static String meeting(String s) {
        String s1, s2;
        s1 = s.replace(':', ',');
        s2 = s1.toUpperCase();
        List<String> list = Arrays.asList(s2.split(";"));

        for (int i = 0; i < list.size(); i++) {
            String[] divide = list.get(i).split(",");
            String name1 = divide[0];
            String name2 = divide[1];
            list.set(i, "(" +name2 + ", " + name1 +")");
        }

        Collections.sort(list);

        return String.join("", list);
    }
}
