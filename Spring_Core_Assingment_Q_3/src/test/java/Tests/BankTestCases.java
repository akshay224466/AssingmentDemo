package Tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTestCases {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object controller = context.getBean("controller");
		
		assertEquals(controller.getClass().getSimpleName(), "BankAccountcontroller");
		
	}

}
