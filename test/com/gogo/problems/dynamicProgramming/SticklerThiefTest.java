package com.gogo.problems.dynamicProgramming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SticklerThiefTest {

    SticklerThief sticklerThief;

    @BeforeEach
    void setUp() {
        sticklerThief = new SticklerThief();
    }

    @Test
    void test1() {
        int[] val = {6, 7, 1, 3, 8, 2, 4};
        int maximumStolenValue = sticklerThief.getMaximumStolenValue(val);
        assertEquals(19, maximumStolenValue);
    }

    @Test
    void test2() {
        int[] val = {5, 3, 4, 11, 2};
        int maximumStolenValue = sticklerThief.getMaximumStolenValue(val);
        assertEquals(16, maximumStolenValue);
    }
}