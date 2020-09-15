package com.gogo.problems.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PythagoreanTripletTest {

    PythagoreanTriplet triplet;

    @BeforeEach
    void setUp() {
        triplet = new PythagoreanTriplet();
    }

    @Test
    void isTripletPresent() {
        assertTrue(triplet.isTripletPresent(new int[]{3, 1, 4, 6, 5}));
        assertFalse(triplet.isTripletPresent(new int[]{10, 4, 6, 12, 5}));
    }
}