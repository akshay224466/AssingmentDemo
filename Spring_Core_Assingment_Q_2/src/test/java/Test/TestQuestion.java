package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion {

	@Test
	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Object que = context.getBean("question");
		
		assertEquals(que.getClass().getSimpleName(), "Question");
	}

}
