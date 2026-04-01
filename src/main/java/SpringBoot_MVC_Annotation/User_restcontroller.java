package SpringBoot_MVC_Annotation;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_restcontroller {
    @GetMapping("/d7") 
	public String display7() {
    	 return "Rest Controller from display7 method";
     }
    
    @GetMapping("/d8")
    public String display8() {
    	return "Rest Controller from display8 method";
    }
}
