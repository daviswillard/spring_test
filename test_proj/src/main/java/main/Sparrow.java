package main;

import org.springframework.stereotype.Component;

@Component
public class Sparrow {

    private String name;

    public Sparrow() {}

    public Sparrow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
