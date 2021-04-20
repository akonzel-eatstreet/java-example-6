package com.konzel.example6;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequiredArgsConstructor
public class Boot {
    private final TestService testService;

    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return testService.getDateTimeString();
    }
}
