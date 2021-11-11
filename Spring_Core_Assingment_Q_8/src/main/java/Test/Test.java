package Test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

 public static void main(String[] args) {

  
  @SuppressWarnings("resource")
AbstractApplicationContext context = new ClassPathXmlApplicationContext(("config.xml"));

  
  
 

 Employee employee = (Employee)context.getBean("employee");

  System.out.println("The name of our Employee is : " + employee.getName());
  System.out.println("The age of our Employee is : " + employee.getAge());
  
 

  
  Example example = (Example) context.getBean("example");
 
 System.out.println("Output for the Example class"+example);
 
 
 // The @PreDestroy annotation is used on bean method to be notified when the bean is being removed from the context 
 //or when the context is shutting down.
	//  Shut down event is fired when context.close() or context.registerShutdownHook() is invoked.
 context.registerShutdownHook();
 
 }

}
