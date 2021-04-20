package com.konzel.example5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Boot {
    private final TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }

    public Boot(TestService testService)
    {
        this.testService = testService;
    }

    @GetMapping("/")
    public String hello() {
        return testService.getDateTimeString();
    }
}
