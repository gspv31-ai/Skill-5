package SpringBoot_MVC_Annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Customer1_Controller {

  List<Customer1> customers  = new ArrayList<Customer1>();
  
  @PostMapping("/addcustomer")
  public String getcutomers(@RequestBody Customer1 cust) {
    customers.add(cust);
    return "customer added successfully";
    
    
  }
  @GetMapping("/displaycustomer")
  public List<Customer1>viewcustomer(){
	  return customers;
  }
  
} 