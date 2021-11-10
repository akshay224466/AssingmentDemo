package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer cust = (Customer)context.getBean("customer101");
		
		 
		Customer obj2 = new Customer(101, "Sachin_Tendulkar", 8989898989L,new Address("Gitabhavan_Square", "Indore", "MP", "202020", "India"));
		
		
		if (cust.getCustomer_name().equals(obj2.getCustomer_name())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}


}
