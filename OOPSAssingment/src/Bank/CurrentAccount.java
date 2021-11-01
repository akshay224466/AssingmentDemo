package Bank;

public class CurrentAccount extends Bank {
	private String name="Cuurent Account";
	public void showTotal() {
		System.out.println("Cash Credit of:" +name+ "Balance is" +totalAmount);
	}
}
