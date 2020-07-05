package spring_01.t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloworld = (HelloWorld) context.getBean("hw");
        helloworld.printMessage();
    }
}
