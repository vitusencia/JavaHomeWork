package Animals;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Cat cat() {
        var c = new Cat();
        c.setName("Mitten");
        return c;
    }

    @Bean
    Dog dog() {
        var d = new Dog();
        d.setName("Volt");
        return d;
    }
}
