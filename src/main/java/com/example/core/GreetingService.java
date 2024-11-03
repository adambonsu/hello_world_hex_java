package main.java.com.example.core;

import main.java.com.example.core.domain.Greeting;
import main.java.com.example.core.ports.input.GreetingUseCase;
import main.java.com.example.core.ports.output.GreetingRepository;

public class GreetingService implements GreetingUseCase {
    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public Greeting sayHello(String name) {
        String template = greetingRepository.getGreetingTempate();
        return new Greeting(String.format(template, name));
    }
    
}
