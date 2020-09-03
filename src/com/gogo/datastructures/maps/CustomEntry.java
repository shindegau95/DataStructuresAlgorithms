package com.gogo.datastructures.maps;

public class CustomEntry<K, V> {
    K key;
    V value;

    public CustomEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
