
public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=Demo.getInstance();
		Demo d2=Demo. getInstance();

	}

}
class Demo{
	
	static Demo d=new Demo();
	private Demo() {
		System.out.println("Akshay");
		
	}
	public static Demo getInstance() {
		return d;
		
	}
}
