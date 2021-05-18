package org.example.K7.ConferenceTraveller;

import java.util.Arrays;
import java.util.List;

public class Kata {
    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {

        List<String> citiesVisitedList = Arrays.asList(citiesVisited);

        return Arrays.stream(citiesOffered)
                .dropWhile(citiesVisitedList::contains)
                .findFirst()
                .orElse("No worthwhile conferences this year!");
    }
}
