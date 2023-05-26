package com.geek70w.testdouble.service.impl;

import com.geek70w.testdouble.service.TestQueryService;
import org.springframework.stereotype.Service;

@Service
public class TestQueryServiceImpl implements TestQueryService {
    @Override
    public String success() {
        throw new RuntimeException("hah");
    }
}
