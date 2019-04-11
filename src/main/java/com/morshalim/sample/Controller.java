package com.morshalim.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(value = "/")
	public String welCome() {
		return "Developed by Morshalim.\n"
				+ "Original app is comming soon.\n"
				+ "Mail me at morshalimshaikh@gmail.com for any query \n."
				+ "Thank you.";
	}
}
