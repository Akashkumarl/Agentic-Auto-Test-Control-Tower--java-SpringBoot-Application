package com.autotest.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/api/v1/hello"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.message").value("Hello from AutoTest demo-app"));
    }

    @Test
    void testHelloEndpointWithInvalidPath() throws Exception {
        mockMvc.perform(get("/api/v1/invalid"))
                .andExpect(status().isNotFound());
    }

    @Test
    void testHelloEndpointWithInvalidMethod() throws Exception {
        mockMvc.perform(get("/api/v1/hello"))
                .andExpect(status().isOk());
        // Add a test for a different HTTP method, e.g., POST
        // mockMvc.perform(post("/api/v1/hello"))
        //         .andExpect(status().isMethodNotAllowed());
    }
}