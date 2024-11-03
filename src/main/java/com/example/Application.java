package main.java.com.example;

import main.java.com.example.adaptors.input.CliAdaptor;
import main.java.com.example.adaptors.output.InMemoryGreetingRepository;
import main.java.com.example.core.GreetingService;
import main.java.com.example.core.ports.input.GreetingUseCase;
import main.java.com.example.core.ports.output.GreetingRepository;

public class Application {
    public static void main(String[] args) {
        GreetingRepository greetingRepository = new InMemoryGreetingRepository();
        GreetingUseCase greetingUseCase = new GreetingService(greetingRepository);
        CliAdaptor cliAdaptor = new CliAdaptor(greetingUseCase);

        cliAdaptor.greet("World");
    }
}
