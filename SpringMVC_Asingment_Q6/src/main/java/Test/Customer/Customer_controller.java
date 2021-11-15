package Test.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Customer_controller {
	
	Customer_Model customer_model = new Customer_Model();
	
	
	
	@RequestMapping(value = "/regis", method = RequestMethod.GET)
	public String registrationpage() {
		
		return "registration"; 
		
	}
	
	@RequestMapping(value = "/regis", method = RequestMethod.POST)
	public String sayHelloWelcome(ModelMap model,@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String city, @RequestParam String contact, @RequestParam String zipcode) {
		
		if(username.equals(customer_model.username) && password.equals(customer_model.password) && email.equals(customer_model.email) && city.equals(customer_model.city) && contact.equals(customer_model.contact) && zipcode.equals(customer_model.zipcode) ) {
			model.put("print", "Welcome");
			return "success";
		}else {
			return "error";
		}
		
	}
	
	
	
}