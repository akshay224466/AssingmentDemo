package Third;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
/*
class Demo{
	
		private String name;
		public String getName() {
		return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		
	}
*/

public class Three {
	//1.Predicate
	//2.Consumer 
	public static void main(String[] args) {
		
		/*1.Predicate=It shows boolean result.
		Predicate<String> checklength=str->str.length()>5;
		//Check length of string 
		System.out.println(checklength.test("abcd"));*/
		
		//2.Consumer = It Modifies the data
		/*
		Demo d=new Demo();
		Consumer<Demo> setName=t->t.setName("Akshay_Luhadiya");
		setName.accept(d);
		System.out.println(d.getName());*/
		
		//3.Funtion = It shows both input and output
		/*
		Function<Integer,String> getInt=t->t*5 +" multiply by 5";
		System.out.println(getInt.apply(2));*/
		
		//4.Supplier - it shows only output
		/*
		Supplier<Double> getRandomDouble=()->Math.random();
		System.out.println(getRandomDouble.get());*/
		
	
		
		
		
	    
	  }
	
}
	
	

