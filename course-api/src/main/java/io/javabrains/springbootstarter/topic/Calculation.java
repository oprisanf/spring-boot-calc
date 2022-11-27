package io.javabrains.springbootstarter.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculation {
	
	@RequestMapping("/calculation")
	public int calcu() {
	return 1;
	}
	

}
