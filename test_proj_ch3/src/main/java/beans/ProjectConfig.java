package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "beans")
public class ProjectConfig {
    @Bean
    public Yulya yulya() {
        Yulya yu = new Yulya();
        yu.setName("KuliYulya");
        return yu;
    }

    @Bean
    public Yulya yulya2() {
        Yulya yu = new Yulya();
        yu.setName("Yulka");
        return yu;
    }


    /* Внедрение через параметр в случае нескольких бинов одного типа */
    /*@Bean
    public Person person(Yulya yulya) {
        Person p = new Person();
        p.setName("Kamil");
        p.setYulya(yulya);
        return p;
    }*/

    /* Применение аннотации @Qualifier */
    /*@Bean
    public Person person(
            @Qualifier("yulya") Yulya yulya) {

        Person p = new Person();
        p.setName("Kamil");
        p.setYulya(yulya);
        return p;
    }*/
}
