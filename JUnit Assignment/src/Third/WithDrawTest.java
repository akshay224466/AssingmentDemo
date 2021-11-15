package Third;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WithDrawTest {

	@Test
	void test() {
		BankAccount demoAccount = new BankAccount();
		String exception ="";
		try {
			demoAccount.withDraw(10000);
		} catch (Exception e) {
			  exception = e.toString();	
		}
		
		assertEquals(exception, "Third.InSufficientBalanceException");
			 
	}

}