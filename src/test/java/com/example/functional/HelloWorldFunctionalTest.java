package com.example.functional;

import org.testng.annotations.Test;

import com.example.core.GreetingService;
import com.example.core.domain.Greeting;
import com.example.core.ports.output.GreetingRepository;

import static org.testng.Assert.*;
public class HelloWorldFunctionalTest {

    @Test
    public void testHelloWorldOutput() {
        String expectedOutput = "Hello World";
        String actualOutput = getHelloWorldOutput();

        assertEquals(expectedOutput, actualOutput);
    }

    private String getHelloWorldOutput() {
        GreetingRepository greetingRepository = () -> "Hello";
        GreetingService service = new GreetingService(greetingRepository);

        Greeting greeting = service.greet("World");
        return greeting.getMessage();
    }
    
}
