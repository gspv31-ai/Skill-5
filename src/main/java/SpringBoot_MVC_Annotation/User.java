package SpringBoot_MVC_Annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class User {
    @GetMapping("/welcome")
   // @ResponseBody
	public String display() {
		return "Welcome Controller";
	}
    @GetMapping("/d1")
  //  @ResponseBody
    public String display1(){
    	return "controller from display1 method";
    }
    
    @GetMapping("/d2")
   // @ResponseBody
    public String display2() {
    	return "Controller from display2 method";
    }
    
    @GetMapping("/d3")
    public int display3() {
    	return 10;
    }
    
    //with parameter name @requestParam
    
    
    @GetMapping("/d9")
    public int display9(@RequestParam("id") int uid) {
    	return uid;
    }
    
    
    //without parameter name@ pathVariable
    @GetMapping("/d10")
    public int display10(@PathVariable("eid") int uid1) {
    	return uid1;
    }
    
    @GetMapping("/d11")
    public int display11(@RequestParam("i") int a, @RequestParam("j") int b){
    	return a+b;
    }
    
    @GetMapping("/d12")
    public String display12(@RequestParam("i") String name) {
    	return name;
    }
    
    @GetMapping(value="d4")
    public String display4() {
    	return "Controller from display4 method";
    }
    
    @GetMapping(path="d5")
    public String display5() {
    	return "Controller from display5 method";
    }
}
