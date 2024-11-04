package com.example.core.ports.input;
import com.example.core.domain.Greeting;

public interface GreetingUseCase {
    Greeting sayHello(String name);
}
