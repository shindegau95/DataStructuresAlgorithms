package com.gogo.maps;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomMapTest {

    CustomMap map;

    @BeforeEach
    void setUp() {
        map = new CustomMap();
    }

    @Test
    void testMap() {
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(11, "z");

        assertEquals("b", map.get(2));
        assertEquals("a", map.get(1));
        assertEquals("c", map.get(3));
        assertEquals("z", map.get(11));
    }
}