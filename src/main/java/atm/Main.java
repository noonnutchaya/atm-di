package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // ----- XML -----

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");
        ATMSimulator atmSimulator = context.getBean("ATMSimulator_", ATMSimulator.class);
        atmSimulator.run();

        // ----- Annotation -----

//        ApplicationContext context =
//              new ClassPathXmlApplicationContext("configAnnotation.xml");

        // ----- JAVA -----

//        ApplicationContext context =
//                new AnnotationConfigApplicationContext(ConfigJava.class);

        // ----- XML + DB -----

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("configWithDB.xml");
//        ATMSimulator atmSimulator = context.getBean("ATMSimulator_", ATMSimulator.class);
//        atmSimulator.run();

    }
}