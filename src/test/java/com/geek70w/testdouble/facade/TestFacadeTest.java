package com.geek70w.testdouble.facade;

import com.geek70w.testdouble.facade.impl.TestFacadeImpl;
import com.geek70w.testdouble.service.TestQueryService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TestFacadeTest {
    @InjectMocks
    private TestFacadeImpl facade;
    @Mock
    private TestQueryService testQueryService;

    @Test
    void should_success() {
        //setup
        String success = "success";
        when(testQueryService.success()).thenReturn(success);
        //exercise
        String result = facade.success();

        //verify
        assertEquals(result, success);
    }
}