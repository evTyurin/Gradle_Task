package com.epam.gradle.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
    @Test
    public void whenNumberIsPositiveThenTrue() {
        assertTrue(StringUtils.isPositiveNumber("47"));
    }
}