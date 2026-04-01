package SpringBoot_MVC_Annotation;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Customer_Controller {
	@GetMapping("/cust")
	public Customer getcustomer() {
		
		Customer c=new Customer("Gaurav","Vijayawada");
		return c;
	}
}
