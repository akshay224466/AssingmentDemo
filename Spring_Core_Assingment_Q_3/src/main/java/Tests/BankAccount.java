package Tests;

public class BankAccount {
	
	int account_ld; 
	String account_Holder_Name;
	String account_Type;
	long account_Balance;
	
	public BankAccount(int accountld, String accountHolderName, String accountType, long accountBalance) {
		super();
		this.account_ld = accountld;
		this.account_Holder_Name = accountHolderName;
		this.account_Type = accountType;
		this.account_Balance = accountBalance;
	}

}
