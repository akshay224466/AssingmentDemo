package Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using setter injection
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	//	Customer cuts = (Customer) context.getBean("obj");
		 
		Customer customer2 = (Customer)context.getBean("customer101");
		customer2.displayCustomer();
	    

	}

}
