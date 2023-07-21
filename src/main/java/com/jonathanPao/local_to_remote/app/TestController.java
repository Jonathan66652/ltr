package com.jonathanPao.local_to_remote.app;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class TestController {
	
	@GetMapping("/test")
	public String getInfo() {
		String aa = "";
		new Date();
		String.format("%s%s", "aa", "bb");
		return "";
	}
}
