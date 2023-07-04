package com.microservice.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/getbank")
	public String getMessage()
	{
		return " Welcome to SBI Bank ...........";
	}
	
	@GetMapping("/transfer")
	public String transfer()
	{
		return " funds to be transfer......";
	}
	
	@GetMapping("/about")
	public String about()
	{
		return " about bank details......";
	}

}
