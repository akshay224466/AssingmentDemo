package Third;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.*;  
import java.lang.reflect.*;  



@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Execute{
	
	int Sequence() ;
}



class ABCD{	
	
	  @Execute(Sequence=2)
	  public void method1()
	      {
		  System.out.println("In method 2");
		  } 
	  
	  @Execute(Sequence=1)
	  public void method2()
	      {
		  System.out.println("In method 1");
		  } 
	  
	  @Execute(Sequence=3)
	  public void method3()
	      {
		  System.out.println("In method 3");
		  } 
	  }







public class Three {
	
	public static void main(String[] args) throws Exception {
		
		ABCD abcd = new ABCD();
		
		
		Method ms = abcd.getClass().getMethod("method1");
		Annotation ann = ms.getAnnotation(Execute.class);
		Execute es = (Execute)ann;
		System.out.println( es.Sequence());

}}
