package com.example.profiling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication


public class ProfilingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfilingApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
public void welcomePage() {
        System.out.println("Welcome to Profiling");
}
}
