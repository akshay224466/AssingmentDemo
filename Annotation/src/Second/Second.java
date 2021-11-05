package Second;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;	
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int AuthorID() default 101;
	
	String Author() default"Akshay_Jain";
	String Date() default"05/11/2021";
	String Time() default"5:00";
	
	int Version() default 12;
	String Description() default"Hello_Custom_Annotation @Info";
	
	
}



@Info()
class Toss{
	
}


public class Second {
	public static void main(String args[]) {
		
		Toss ts=new Toss();
		
		Class vrt  = ts.getClass();
		Annotation ant=vrt.getAnnotation(Info.class);
		Info i=(Info)ant;
		

		System.out.println("AuthorID:"+i.AuthorID()); 
		System.out.println("Author:"+i.Author()); 
	
		System.out.println("Date:"+i.Date()); 
		System.out.println("Time:"+i.Time()); 
		System.out.println("Version:"+i.Version()); 
		System.out.println("Description:"+i.Description()); 
		
		
	
		
		
	}
}
