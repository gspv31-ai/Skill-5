package SpringBoot_MVC_Annotation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.registry.ImportHttpServices;
import org.springframework.web.service.registry.ImportHttpServices.Container;


@Container(value = { @ImportHttpServices })
@ResponseBody
public class User_html {
	@GetMapping("/html")
	public String gethtml() { 
		return "index";
	}
}
