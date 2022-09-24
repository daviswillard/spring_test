package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonMethodAutowired {
    private String name = "fakeKamil";

    private Yulya yulya;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Yulya getYulya() {
        return yulya;
    }

    @Autowired
    public void setYulya(Yulya yulya) {
        this.yulya = yulya;
    }
}
