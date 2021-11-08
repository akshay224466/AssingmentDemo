package First;

@FunctionalInterface
interface Arithmetic{
	int operations(int a,int b);
	
}
public class Test {
	
	public static void main(String [] args)
	{
		//performing the addition operation 
		
		Arithmetic addition = (int a, int b)->(a+b);
		System.out.println("Addition is: "+addition.operations(10, 5));
		
		//performing the subtraction operation
		Arithmetic subtraction = (int a, int b)->(a-b);
		System.out.println("Subtraction is: "+subtraction.operations(10, 5));
		
		//performing the multiplication operation
		Arithmetic multiplication = (int a, int b)->(a*b);
		System.out.println("Multiplication is: "+multiplication.operations(10, 5));
		
		//performing the division//performing the addition operation operation
		Arithmetic division = (int a, int b)->(a/b);
		System.out.println("Division is: "+division.operations(10, 5));
		
	} 	
		}


