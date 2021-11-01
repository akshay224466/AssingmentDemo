package Generics4;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, String> obj1 = new Pair<String, String>("1", "HelloWorld ");
		Pair<String, java.util.Date> obj2 = new Pair<>("Today is :", new java.util.Date());

		System.out.println(obj1.showData());
		System.out.println(obj2.showData());

	}

}
