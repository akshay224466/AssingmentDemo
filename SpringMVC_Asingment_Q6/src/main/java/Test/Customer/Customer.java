package Test.Customer;

public class Customer {
	
	private String username;  
	private String password;  
	private String email;  
	private String city;  
	private String contact; 
	private String zipcode;
	
	  
	
	
	
	public Customer(String username, String password, String email, String city, String contact, String zipcode) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.city = city;
		this.contact = contact;
		this.zipcode = zipcode;
	}





	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
