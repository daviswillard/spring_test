package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Kamil";

    private Yulya yulya;

//    public Person() {
//    }


    //@Autowired не нужен, поскольку это единственный конструктор. Если конструктор не единственный, аннотация необходима
    public Person(@Qualifier("yulya") Yulya yulya) {
        this.yulya = yulya;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Yulya getYulya() {
        return yulya;
    }

    public void setYulya(Yulya yulya) {
        this.yulya = yulya;
    }
}

