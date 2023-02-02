package com.learncha.api.healthcheck.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1/hello")
@RestController
public class TestController {

    @GetMapping
    public void method_01() {
        System.out.println("hello");
    }
}
