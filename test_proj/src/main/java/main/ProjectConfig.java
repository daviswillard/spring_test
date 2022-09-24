package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    @Primary
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("Kiki");
        return p;
    }

    @Bean
    Parrot parrot3() {
        var p = new Parrot();
        p.setName("Keke");
        return p;
    }

    @Bean(name = "mika")
    Parrot parrot4() {
        var p = new Parrot();
        p.setName("Mika");
        return p;
    }

    @Bean
    String Hello() {
        return "Hello world";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
