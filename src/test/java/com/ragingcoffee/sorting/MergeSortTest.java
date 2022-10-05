package com.ragingcoffee.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public final class MergeSortTest {
    
    @Test
    @DisplayName("Correct Sorting Test")
    void testCorrectOutput() {
        int[] givenInput = {69, 420, 8, 9, -12};
        int[] expectedOutput = {-12, 8, 9, 69, 420};
        MergeSort.mergeSort(givenInput);
        assertEquals(Arrays.toString(expectedOutput), Arrays.toString(givenInput));
    }
}
