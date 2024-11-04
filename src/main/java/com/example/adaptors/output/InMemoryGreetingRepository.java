package com.example.adaptors.output;

import com.example.core.ports.output.GreetingRepository;

public class InMemoryGreetingRepository implements GreetingRepository {

    @Override
    public String getGreetingTempate() {
        return "Hello %s";
    }
    
}
