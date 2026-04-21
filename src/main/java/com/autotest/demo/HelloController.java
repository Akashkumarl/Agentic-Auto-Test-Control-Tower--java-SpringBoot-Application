package com.autotest.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.autotest.demo.service.MathService;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    private final MathService mathService;

    @Autowired
    public HelloController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from AutoTest demo-app");
    }

    @GetMapping("/add")
    public Map<String, Integer> add(@RequestParam int a, @RequestParam int b) {
        return Map.of("result", mathService.add(a, b));
    }
}
