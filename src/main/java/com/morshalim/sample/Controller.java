package com.morshalim.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(value = "/")
	public String welCome() {
		return "Hello World, this is sample project. Main application is comming soon";
	}
}
