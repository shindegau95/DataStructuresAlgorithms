package com.gogo.datastructures.maps;

import java.util.ArrayList;
import java.util.List;

public class CustomMap<K, V> {

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

    public void put(K key, V value) {
        if (buckets[key.hashCode()] == null) {
            buckets[key.hashCode()] = new ArrayList<>();
        }
        CustomEntry entry = new CustomEntry(key, value);
        buckets[key.hashCode()].add(entry);
    }

    public String get(K key) {
        List<CustomEntry<Integer, String>> entries = buckets[key.hashCode()];
        for (CustomEntry<Integer, String> entry : entries) {
            if (entry.getKey() == key) {
                return entry.getValue();
            }
        }
        return null;
    }
}
