package com.ldap.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LdapController {

	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
}
