package com.twk.restservice;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.*;
import javax.validation.constraints.NotEmpty;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") @NotEmpty String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
