package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App { public static void main(String[] args ) {

    String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

    Map<String, String> mymap = new HashMap<>();

    String[] pairs = s.split(";");
    for (int i = 0; i < pairs.length; i++) {
        String pair = pairs[i];
        String[] keyValue = pair.split(":");
        mymap.put(keyValue[0], keyValue[1]);
    }




    }
}

