package org.example.K7.SantaNaughtyList;

import java.util.*;

public class findList {
    public static List<String> findChildren(List<String> santasList, List<String> children) {
        Set<String> lista = new HashSet<>();

        for (int i = 0; i < santasList.size(); i++) {
            for (int j = 0; j < children.size(); j++) {
                if (santasList.get(i).equals(children.get(j))) {
                    lista.add(santasList.get(i));
                }
            }
        }
        ArrayList<String> res = new ArrayList<>(lista);
        Collections.sort(res);
        return res;
    }
}
