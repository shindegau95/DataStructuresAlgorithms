package com.gogo.datastructures.maps;

import java.util.ArrayList;
import java.util.List;

public class CustomMap {

    int maxSize;
    List<CustomEntry<Integer, String>>[] buckets;

    public CustomMap() {
        this.maxSize = 10;
        buckets = new List[maxSize];
    }

    public CustomMap(int maxSize) {
        this.maxSize = maxSize;
        buckets = new List[maxSize];
    }

    private int hash(int key) {
        return key % maxSize;
    }

    public void put(int key, String value) {
        if (buckets[hash(key)] == null) {
            buckets[hash(key)] = new ArrayList<>();
        }
        CustomEntry entry = new CustomEntry(key, value);
        buckets[hash(key)].add(entry);
    }

    public String get(int key) {
        List<CustomEntry<Integer, String>> entries = buckets[hash(key)];
        for (CustomEntry<Integer, String> entry : entries) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }
}
