package org.example.K7.InteractiveDictionary;

import java.util.HashMap;

public class Dictionary {

    public HashMap<String, String> map;

    public Dictionary(){
        this.map = new HashMap<>();

    }

    public void newEntry(String key, String value){
        map.put(key, value);
    }

    public String look(String key){
        if (map.containsKey(key) == false) {
            return "Cant find entry for " + key;
        }

        return map.get(key);

    }
}

