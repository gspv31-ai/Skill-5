package SpringBoot_MVC_Annotation;

//import org.springframework.web.bind.annotation.RestController;

public class Customer {
	String name;
	String lacation;
	
	
	//@RestController
	public Customer(String name, String lacation) {
		super();
		this.name = name;
		this.lacation = lacation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLacation() {
		return lacation;
	}
	public void setLacation(String lacation) {
		this.lacation = lacation;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", lacation=" + lacation + "]";
	}
	
	

}
