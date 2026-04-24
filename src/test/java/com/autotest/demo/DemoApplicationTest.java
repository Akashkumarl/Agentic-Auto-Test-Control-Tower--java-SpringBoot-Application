package com.autotest.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DemoApplicationTest {

    @Test
    void testMain() {
        assertDoesNotThrow(() -> DemoApplication.main(new String[0]));
    }
}