package Tests;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BankAccountcontroller implements ApplicationContextAware, BeanNameAware{
	
	ApplicationContext context;
	String bean;
	BankAccount obj;
	
	public void withdraw(long accountld, double balance) {
		
		 obj.account_Balance -= balance;
		
	}
	
	public void deposit(long accountld, double balance) {
		
		 obj.account_Balance += balance;
		
	}
	public long getBalance(long accountld) {
		return obj.account_Balance;
	}
//	public boolean fundTransfer(long fromAccount, long toAccount, double amount);
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		 
		this.context = applicationContext;
		obj =(BankAccount) applicationContext.getBean("Account");
	}

public void setBeanName(String name) {
	// TODO Auto-generated method stub
	this.bean = name;
}

}
