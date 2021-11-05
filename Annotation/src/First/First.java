package First;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String Test();
}

class Task{
	@Test(Test="welcome to the annotation")
	public void hey(){
		
		System.out.println("Annotation is working");
		
	}
}


public class First {

	public static void main(String args[]) throws Exception {
		
		Task t1=new Task();
		Method abc=t1.getClass().getMethod("hey");
		Annotation antn=abc.getAnnotation(Test.class);
		Test t2=(Test)antn;
		System.out.println(t2.Test());
	}
}
