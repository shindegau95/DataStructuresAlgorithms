package com.gogo.problems.others;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MissingDuplicateSumTest {

    MissingDuplicateSum missingDuplicateSum;

    @BeforeEach
    void setUp() {
        missingDuplicateSum = new MissingDuplicateSum();
    }

    @Test
    void findDuplicateAndMissing() {
        int[] arr = {4, 3, 1, 5, 4};
        missingDuplicateSum.findDuplicateAndMissing(arr);
    }
}