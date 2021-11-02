package CollectionAssingment;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
public class Second {
	
	      
		public static void main (String[] args) {
			 
			Demo obj1 = new Demo( 9020304050L, "Akshay" , "nk@gmail.com" , "Male");
			Demo obj2 = new Demo( 9768595385L, "Pranjal" , "pj@gmail.com" , "Male");
			Demo obj3 = new Demo( 9020367494L, "Chetan" , "ck@gmail.com" , "Female");

			Map<Long, Demo> data = new TreeMap<Long, Demo>(Collections.reverseOrder());
			
			
			data.put(1234L, obj1);
			data.put(123456780L, obj2);
			data.put(1238244L, obj3);
		 	 
			 System.out.println("Keys : "+data.keySet() + "\n");
			 System.out.println("Values : " + data.values() + "\n");
			 System.out.println(data + "\n");
			 
		}

}
