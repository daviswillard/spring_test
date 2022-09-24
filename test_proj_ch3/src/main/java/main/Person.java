package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Kamil";

    /* Внедрение значений через поля класса с использованием аннотации @Autowired */
// !   @Autowired
    private final Yulya yulya;

    /* Использование аннотации @Autowired для внедрения значения через конструктор */
    @Autowired
    public Person(Yulya yulya) {
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

//    public void setYulya(Yulya yulya) {
//        this.yulya = yulya;
//    }
}

/*Создание циклической зависимости*/

/*
@Component
public class Person {

    private String name;
    private final Parrot parrot;
    @Autowired
    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    // Остальной код
}
*/

