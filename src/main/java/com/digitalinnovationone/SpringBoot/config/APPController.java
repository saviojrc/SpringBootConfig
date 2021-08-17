package com.digitalinnovationone.SpringBoot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APPController {
	
	@Value("${app.message}")
	private String appMenssage;
	
	@GetMapping("/")
	public String getAppMenssage() {
		return appMenssage;
	}
	

}
