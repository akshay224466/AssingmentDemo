package Collectionsecond;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Dummy {
	public static void main(String[] args) {
		 
		Despo  product1 = new Despo ("A");
		Despo  product2 = new Despo ("B");
		Despo  product3 = new Despo ("C");
		
		Set<Despo > unique = new TreeSet<>();
		
		unique.add(product1);
		unique.add(product2);
		unique.add(product3);
		
		unique.add(product1); //Try to add duplicate object it get replaced with the Similar one
		
		  Iterator<Despo > i= unique.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next().name);  
	         }  

	}

}
class Despo implements Comparable<Despo >{
	
	String name;

	public Despo (String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Despo  o) {
		  
		if (name.compareTo(o.name)>0) {
            return 1;
        }
        else if (name.compareTo(o.name)<0) {
            return -1;
        }
        else {
            return 0;
        } 
	}	
}
