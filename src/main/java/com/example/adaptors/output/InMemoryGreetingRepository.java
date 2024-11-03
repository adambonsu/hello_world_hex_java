package main.java.com.example.adaptors.output;

import main.java.com.example.core.ports.output.GreetingRepository;

public class InMemoryGreetingRepository implements GreetingRepository {

    @Override
    public String getGreetingTempate() {
        return "Hello %s";
    }
    
}
