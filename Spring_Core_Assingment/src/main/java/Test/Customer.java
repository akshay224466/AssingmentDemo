package Test;

public class Customer {
	
	private int customer_id;  
	private String customer_name;  
	private Address customer_address;
	private long customer_contact;
	
	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customer_id = customerId;
		this.customer_name = customerName;
		this.customer_contact = customerContact;
		this.customer_address = customerAddress;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public Address getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(Address customer_address) {
		this.customer_address = customer_address;
	}
	public long getCustomer_contact() {
		return customer_contact;
	}
	public void setCustomer_contact(int customer_contact) {
		this.customer_contact = customer_contact;
	}
	
	public void displayCustomer() {
		System.out.println("Customer Id : " + customer_id + " customer Name: " + customer_name + " Customer contact : " + customer_contact + " Customer Address: " + customer_address);
	}
	
	
	
}
