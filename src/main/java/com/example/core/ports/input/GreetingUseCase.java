package main.java.com.example.core.ports.input;
import main.java.com.example.core.domain.Greeting;

public interface GreetingUseCase {
    Greeting sayHello(String name);
}
