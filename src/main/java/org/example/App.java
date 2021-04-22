package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class App { public static void main(String[] args ) {

    String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";


    Map<String, String> mymap = new HashMap<>();
    Map<String, String> mymap1 = new HashMap<>();

    String[] pairs = s.split(";");
    for (int i = 0; i < pairs.length; i++) {
        String pair = pairs[i];
        String[] keyValue = pair.split(":");
        mymap.put(keyValue[0].toUpperCase(), keyValue[1].toUpperCase());
    }


    List<String> result = mymap.keySet().stream().sorted().collect(Collectors.toList());
    System.out.println(result);




    }
}

