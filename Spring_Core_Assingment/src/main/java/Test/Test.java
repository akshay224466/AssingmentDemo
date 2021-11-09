package Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer cust = (Customer) context.getBean("obj");
		 
	    System.out.println(cust.getCustomer_id());
	    System.out.println(cust.getCustomer_name());
	    System.out.println(cust.getCustomer_address());
	    System.out.println(cust.getCustomer_contact());
	    

	}

}
