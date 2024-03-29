package nworld.dev.helloboot;

import org.junit.jupiter.api.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.assertj.core.api.Assertions.assertThat;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@UnitTest
@interface FastUnitTest {
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Test
@interface UnitTest {
}

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
