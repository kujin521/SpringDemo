package spring_01.t3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld hw1 = (HelloWorld) context.getBean("hw1");
        hw1.printMessage();
        HelloWorld hw2 = (HelloWorld) context.getBean("hw2");
        hw2.printMessage();
    }
}
