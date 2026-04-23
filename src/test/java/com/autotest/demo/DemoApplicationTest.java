package com.autotest.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTest {

    @Test
    void contextLoads() {
        DemoApplication.main(new String[0]);
    }

    @Test
    void smoke() {
    }
}