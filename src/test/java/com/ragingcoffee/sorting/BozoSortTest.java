package com.ragingcoffee.sorting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public final class BozoSortTest {
    
    @Test
    @DisplayName("Negative Sorting Check Test")
    void testWrongComparison() {
        int[] testArray = {69, 420, 8, 9, -12};
        assertFalse(BozoSort.isSorted(testArray));
    }

    @Test
    @DisplayName("Positive Sorting Check Test")
    void testCorrectComparison() {
        int[] testArray = {-12, 8, 9, 69, 420};
        assertTrue(BozoSort.isSorted(testArray));
    }

    @Test
    @DisplayName("Correct Sorting Test")
    void testCorrectOutput() {
        int[] givenInput = {69, 420, 8, 9, -12};
        int[] expectedOutput = {-12, 8, 9, 69, 420};
        BozoSort.bozoSort(givenInput);
        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(givenInput));
    }
}
