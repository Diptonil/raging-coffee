package com.ragingcoffee.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public final class StringSplitTest {

    @Test
    @DisplayName("Correct Output Test")
    void testCorrectOutput() {
        String expectedOutput = "Name: Bruce Wayne\nYear born: 1939\nMonth: 05\nDay: 27";
        assertEquals(expectedOutput, StringSplit.split("Bruce Wayne, 27/05/1939"));
    }

    @Test
    @DisplayName("Wrong Output Test")
    void testWrongOutput() {
        String expectedOutput = "Name: Bruce Wayne Year born: 1939 Month: 05 Day: 27";
        assertNotEquals(expectedOutput, StringSplit.split("Bruce Wayne, 27/05/1939"));
    }

    @Test
    @DisplayName("Erraneous Input Test")
    void testErraneousOutput() {
        String expectedOutput = "Commas or backslashes absent from the input string.";
        assertEquals(expectedOutput, StringSplit.split("Bruce Wayne 27 05 1939"));
    }
}
