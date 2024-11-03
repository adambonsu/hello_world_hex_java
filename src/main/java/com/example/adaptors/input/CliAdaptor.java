package main.java.com.example.adaptors.input;

import main.java.com.example.core.ports.input.GreetingUseCase;

public class CliAdaptor {
    private final GreetingUseCase greetingUseCase;

    public CliAdaptor(GreetingUseCase greetingUseCase) {
        this.greetingUseCase = greetingUseCase;
    }

    public void greet(String name) {
        System.out.println(greetingUseCase.sayHello(name).getMessage());
    }
    
}
