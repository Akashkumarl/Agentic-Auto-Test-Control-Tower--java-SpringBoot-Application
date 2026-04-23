package com.autotest.demo.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathServiceImplTest {

    private final MathServiceImpl mathService = new MathServiceImpl();

    @Test
    @DisplayName("Should correctly add two positive integers")
    public void testAdd_PositiveNumbers() {
        // Arrange
        int a = 5;
        int b = 10;
        int expected = 15;

        // Act
        int actual = mathService.add(a, b);

        // Assert
        assertEquals(expected, actual, "The sum of 5 and 10 should be 15");
    }

    @Test
    @DisplayName("Should correctly handle negative numbers")
    public void testAdd_NegativeNumbers() {
        // Act & Assert
        assertEquals(-2, mathService.add(3, -5), "Adding 3 and -5 should result in -2");
        assertEquals(0, mathService.add(0, 0), "Adding 0 and 0 should result in 0");
    }
}