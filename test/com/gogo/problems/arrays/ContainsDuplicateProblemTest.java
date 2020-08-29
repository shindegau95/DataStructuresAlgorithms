package com.gogo.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateProblemTest {

    @Test
    void findDuplicates() {
        assertTrue(ContainsDuplicateProblem.findDuplicates(new int[]{1, 2, 3, 1}));
    }
}