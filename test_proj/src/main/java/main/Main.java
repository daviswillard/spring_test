package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot Koko = context.getBean(Parrot.class);
        System.out.println(Koko.getName());
        Parrot Kiki = context.getBean("parrot2", Parrot.class);
        System.out.println(Kiki.getName());
        Parrot Keke = context.getBean("parrot3", Parrot.class);
        System.out.println(Keke.getName());
        Parrot Mika = context.getBean("mika", Parrot.class);
        System.out.println(Mika.getName());

        Sparrow jack = context.getBean(Sparrow.class);
        System.out.println(jack.getName());

        String str = context.getBean(String.class);
        System.out.println(str);
        Integer integer = context.getBean(Integer.class);
        System.out.println(integer);

        Parrot maiko = new Parrot("Maiko");
        Supplier<Parrot> parrotSupplier = () -> maiko;

        context.registerBean("parrot5",
                Parrot.class, parrotSupplier);

        Parrot p = context.getBean("parrot5", Parrot.class);
        System.out.println(p.getName());
    }
}
