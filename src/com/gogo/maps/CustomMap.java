package com.gogo.maps;

import java.util.ArrayList;
import java.util.List;

public class CustomMap {

    int maxSize;
    List<CustomEntry<Integer, String>>[] listOfEntries;

    public CustomMap() {
        this.maxSize = 10;
        listOfEntries = new List[maxSize];
    }

    public CustomMap(int maxSize) {
        this.maxSize = maxSize;
        listOfEntries = new List[maxSize];
    }

    private int hash(int key) {
        return key % maxSize;
    }

    public void put(int key, String value) {
        if (listOfEntries[hash(key)] == null) {
            listOfEntries[hash(key)] = new ArrayList<>();
        }
        CustomEntry entry = new CustomEntry(key, value);
        listOfEntries[hash(key)].add(entry);
    }

    public String get(int key) {
        List<CustomEntry<Integer, String>> entries = listOfEntries[hash(key)];
        for (CustomEntry<Integer, String> entry : entries) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }
}
