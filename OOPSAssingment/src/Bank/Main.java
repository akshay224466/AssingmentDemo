package Bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.showTotal();
		
		Bank savingAC=new SavingAccount();
		Bank current=new CurrentAccount();
		
		savingAC.addAmount(15000);
		current.addAmount(25000);
		
		b.addTototalBankCash(current);
		b.addTototalBankCash(savingAC);
		
		current.showTotal();
		savingAC.showTotal();
		
		b.showTotal();
		

	}

}
