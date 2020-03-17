package org.kieran.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")//only for a GET, other method need to be defined as POST,DELETE etc
	public String sayHi() {
		return "HI";
		
	}

}
