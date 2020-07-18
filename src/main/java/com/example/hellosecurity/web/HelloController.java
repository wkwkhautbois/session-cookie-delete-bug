package com.example.hellosecurity.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String get() {
		return "hello";
	}

	@GetMapping("/sessionTimeout")
	public String sessionTimeout() {
		return "sessionTimeout";
	}
}
