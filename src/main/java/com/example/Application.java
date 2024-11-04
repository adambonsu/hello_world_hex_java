package com.example;

import com.example.adaptors.input.CliAdaptor;
import com.example.adaptors.output.InMemoryGreetingRepository;
import com.example.core.GreetingService;
import com.example.core.ports.input.GreetingUseCase;
import com.example.core.ports.output.GreetingRepository;

public class Application {
    public static void main(String[] args) {
        GreetingRepository greetingRepository = new InMemoryGreetingRepository();
        GreetingUseCase greetingUseCase = new GreetingService(greetingRepository);
        CliAdaptor cliAdaptor = new CliAdaptor(greetingUseCase);

        cliAdaptor.greet("World");
    }
}
