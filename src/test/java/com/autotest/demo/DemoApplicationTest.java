package com.autotest.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DemoApplicationTest {

    @Test
    void testMainMethod() {
        assertDoesNotThrow(() -> DemoApplication.main(new String[]{}));
    }
}