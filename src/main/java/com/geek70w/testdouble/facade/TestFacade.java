package com.geek70w.testdouble.facade;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/orders")
public interface TestFacade {

    @GetMapping
    public String success();
}
