package com.jonathanPao.local_to_remote.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class TestController {
	
	@GetMapping("/test")
	public String getInfo() {
		String aa = "";
		return "";
	}
}
