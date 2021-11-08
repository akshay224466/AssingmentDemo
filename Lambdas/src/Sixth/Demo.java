package Sixth;
import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Dummy implements UnaryOperator<String>{
	public String apply(String str) {
	      return str.toUpperCase();
	   }
}


public class Demo {
	
	public static void main(String[] args) {
	      ArrayList<String> list = new ArrayList<>();
	      list.add("Hi");
	      list.add("i am");
	      list.add("Akshay_luhadiya");
	      list.add("i am ");
	      list.add("good");
	      System.out.println("Contents of the list before conversion: "+list);
	      list.replaceAll(new Dummy());
	      System.out.println("\nContents of the list after replace operation: "+list);
	   }
	
	

}
