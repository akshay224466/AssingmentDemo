
public class ArmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=153;
		int c=0,a,temp;
		temp=no;

		while(no>0){
			a=no%10;
			no=no/10;
			c=c+(a*a*a);
			}

		if(temp==c){

		System.out.println("Armstrong No");

		}else{

		System.out.println("Not an Armstrong no");

		}

	}

}
