package spring_01.t4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Customer customer= (Customer) context.getBean("customer1");
        System.out.println(customer.toString());
    }
}
