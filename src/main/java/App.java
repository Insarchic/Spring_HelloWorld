import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld) context.getBean("helloworld");
        System.out.println(bean == bean1);

        Cat catBean = (Cat) context.getBean("cat");
        Cat catBean1 = (Cat) context.getBean("cat");
        System.out.println(catBean == catBean1);
    }
}