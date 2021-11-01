package Desert;
import java.util.*;

public class DesertShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DesertItems candy=new Candy();
		DesertItems cookies=new cookies();
		DesertItems icecream=new icecream();
		
		Owner owner=new Owner();
		Customer customer=new Customer();
		Boolean isTrue=true;
		
while(isTrue) {
			
			System.out.println("\n\nOwner or Cutomer");
			System.out.println("press 1 for Owner press 2 for customer and 0 to exti");
			 
			 
			int key = sc.nextInt();
			
			if(key == 1) {
				System.out.println("\n"+"Owner:");
			 
				owner.addDesert(candy, cookies, icecream);	
				
			}else if(key == 2){	
				customer.placeOrder(candy, cookies, icecream);
			}
			else if(key == 0){
				int num = sc.nextInt();
				if (num == 1) {
					isTrue = false;
				}
			}	
		}
		sc.close();
	}
}
