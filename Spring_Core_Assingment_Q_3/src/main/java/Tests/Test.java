package Tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("bean.xml");
		BankAccount account101 = (BankAccount)context.getBean("Account");
		System.out.println(account101.account_Balance);
		BankAccountcontroller account201 = (BankAccountcontroller)context.getBean("controller");
		System.out.println(account201.getBalance(10));
	}

}
