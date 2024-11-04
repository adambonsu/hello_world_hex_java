package test.java.com.example.core;

import com.example.core.GreetingService;
import com.example.core.domain.Greeting;
import com.example.core.ports.output.GreetingRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {

    @Test
    void testSayHello() {
        GreetingRepository greetingRepository = () -> "Hello %s";
        GreetingService service = new GreetingService(greetingRepository);

        Greeting greeting = service.sayHello("World");

        assertEquals("Hello World", greeting.getMessage());
    }
    
}
