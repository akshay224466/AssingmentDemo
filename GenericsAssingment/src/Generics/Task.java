package Generics;
public class Task {

	public static void main(String[] args) {
		
		Integer arr[] = {10,20};
		 
		
		System.out.println("Before  : " + arr[0] +" "+arr[1]);
		
		System.out.print("After  : " );
		 
		task(arr);
		
	}

	public static <E> Void task(E[] arr ) {
		
		E temp= arr[1];
		arr[1] = arr[0];
		arr[0]= temp;
		System.out.println(arr[0]+ " " + arr[1]);
		return null; 
		
	}
}
