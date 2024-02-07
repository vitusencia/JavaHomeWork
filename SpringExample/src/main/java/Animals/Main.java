package Animals;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat c = context.getBean(Cat.class);
        System.out.println(c.getName());

        Dog d = context.getBean(Dog.class);
        System.out.println(d.getName());
    }
}
