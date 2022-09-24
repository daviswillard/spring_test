package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    /*Монтаж бинов путем прямого вызова одного метода с аннотацией @Bean из другого такого же метода*/

/*    @Bean
    Yulya yulya() {
        Yulya p = new Yulya();
        p.setName("Yulya");
        return p;
    }

    @Bean
    Person person() {
        Person p = new Person();
        p.setName("Kamil");
        p.setYulya(yulya());
        return p;
    }*/

    /*Монтаж бинов путем передачи параметра в метод с аннотацией @Bean*/

/*    @Bean
    Yulya yulya() {
        Yulya p = new Yulya();
        p.setName("Yulya");
        return p;
    }

    @Bean
    Person person(Yulya yulya) {
        Person p = new Person();
        p.setName("Kamil");
        p.setYulya(yulya);
        return p;
    }*/
}
