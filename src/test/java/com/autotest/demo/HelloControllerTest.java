package com.autotest.demo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.autotest.demo.service.MathService;

@WebMvcTest(HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @org.springframework.boot.test.mock.mockito.MockBean
    private MathService mathService;



    @Test
    public void testAddEndpoint() throws Exception {
        // 1. Setup the mock behavior
        when(mathService.add(10, 20)).thenReturn(30);

        // 2. Hit /api/v1/add?a=10&b=20
        mockMvc.perform(get("/api/v1/add")
                        .param("a", "10")
                        .param("b", "20"))
                .andExpect(status().isOk())
                // Checks that {"result": 30} exists
                .andExpect(jsonPath("$.result").value(30));
    }
}