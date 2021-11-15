package com.configserverclient.configserverclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${some.value}")
	private String myValue;
	
	@Value("${spring.profiles.active}")
	private String activeProfile;
	
	@GetMapping(path = "/myValue")
	public String myValue() {
		return this.myValue + " desde el perfil: " + activeProfile;
	}
}
