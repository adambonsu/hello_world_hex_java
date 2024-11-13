package com.example.core;

import com.example.core.domain.Greeting;
import com.example.core.ports.input.GreetingUseCase;
import com.example.core.ports.output.GreetingRepository;

public class GreetingService implements GreetingUseCase {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting greet(String name) {
        String greeting = greetingRepository.getGreeting();
        return new Greeting( greeting + " " + name);
    }
    
}
