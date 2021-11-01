package Desert;
import java.util.Scanner;
public class Owner {

	public void addDesert(DesertItems candy, DesertItems cookies, DesertItems icecream) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Add Desert: ");
		Boolean isTrue=true;
		
		while(isTrue) {
			System.out.println("Enter no of candy to add: ");
			candy.numOfDesert += sc.nextInt();
			System.out.println("Enter no of cookies to add: ");
			cookies.numOfDesert += sc.nextInt();
			System.out.println("Enter no of icecream to add: ");
			icecream.numOfDesert += sc.nextInt();
			
			System.out.println("Enter 0 to add more and 1 if completed: ");
			int num=sc.nextInt();
			if(num==1) {
				isTrue=false;
			}
			System.out.println("Item Added Successfully ");
		}
	}

}
