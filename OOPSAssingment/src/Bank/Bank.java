package Bank;

public class Bank {

	private String name="Bank";
	int totalAmount;
	public void addTototalBankCash(Bank obj) {
		totalAmount +=obj.totalAmount;
	}
	public void showTotal() {
		System.out.println("Total Cash in:" +name+ "is" +totalAmount);
	}
	public void addAmount(int amount)
	{
		totalAmount+=amount;
	}	

	}


