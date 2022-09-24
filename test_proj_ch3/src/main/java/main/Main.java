package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        PersonMethodAutowired pma = context.getBean(PersonMethodAutowired.class);
        System.out.println(
                "Person's name: " + person.getName());
        System.out.println(
                "Kamil's yulya: " + person.getYulya());
//        System.out.println(
//                "Kamil's parrot: " + person.getParrot());
        System.out.println(
                "Person's name: " + pma.getName());
        System.out.println(
                "fakeKamil's yulya: " + pma.getYulya());
    }

}
