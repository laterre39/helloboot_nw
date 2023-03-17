package nworld.dev.helloboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloServiceTest {
    @Test
    void simpleHelloService() {
        SimpleHelloService helloService = new SimpleHelloService();

        String hello = helloService.sayHello("Test");
        assertThat(hello).isEqualTo("Hello Test");
    }

    @Test
    void simpleHelloService2() {
        SimpleHelloService helloService = new SimpleHelloService();

        String hello = helloService.sayCars("Audi");
        assertThat(hello).isEqualTo("I Drive Audi");
    }
}
