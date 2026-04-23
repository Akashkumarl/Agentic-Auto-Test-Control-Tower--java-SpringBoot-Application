package com.autotest.demo.service.impl;

import com.autotest.demo.service.MathService;
import org.springframework.stereotype.Service;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
