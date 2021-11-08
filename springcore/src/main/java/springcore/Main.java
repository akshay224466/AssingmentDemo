package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Demo.xml");
	      HelloBean obj = (HelloBean) context.getBean("helloWorld");
	      obj.Hello();

	}

}
