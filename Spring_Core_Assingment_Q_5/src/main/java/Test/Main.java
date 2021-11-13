package Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main  {
 
    @SuppressWarnings("resource")
    public static void main(String[] args) {
 
        ApplicationContext ac = new ClassPathXmlApplicationContext("Bean.xml");
 
        Employee emp = ac.getBean("myemployee", Employee.class);
        System.out.println(emp.toString());
    }
}
