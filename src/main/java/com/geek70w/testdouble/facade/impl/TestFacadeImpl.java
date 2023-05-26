package com.geek70w.testdouble.facade.impl;

import com.geek70w.testdouble.facade.TestFacade;
import com.geek70w.testdouble.service.TestQueryService;

public class TestFacadeImpl implements TestFacade {
    private final TestQueryService testQueryService;

    public TestFacadeImpl(TestQueryService testQueryService) {
        this.testQueryService = testQueryService;
    }

    @Override
    public String success() {
        return testQueryService.success();
    }
}
