package com.ragingcoffee.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public final class StringSplitTest {

    @Test
    @DisplayName("Output Correctness Test")
    void testOutput() {
        String expectedOutput = "Name: Bruce Wayne\nYear born: 1939\nMonth: 05\nDay: 27";
        assertEquals(expectedOutput, StringSplit.split("Bruce Wayne, 27/05/1939"));
    }
    
}
