package main;

import org.springframework.stereotype.Component;

@Component
public class Yulya {
    private String name = "Yulya";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Yulya : " + name;
    }
}
