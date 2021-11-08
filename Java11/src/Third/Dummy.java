package Third;

import java.util.Arrays;
import java.util.List;

public class Dummy {
	
	public static void main(String[] args) {
		 
		List<String> str = Arrays.asList("A","B","C","D","E","F","G","H","I");
		System.out.println(str);
		str.toArray();
		str.forEach(l -> System.out.print(l + " "));
 	}

}
