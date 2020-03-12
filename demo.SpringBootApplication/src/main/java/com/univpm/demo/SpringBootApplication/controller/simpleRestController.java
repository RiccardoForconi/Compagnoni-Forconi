package com.univpm.demo.SpringBootApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.univpm.demo.SpringBootApplication.model.Helloworldclass;

@RestController
public class simpleRestController {
	@GetMapping("/hello")
	public Helloworldclass exampleMethod(@RequestParam(name="param1", defaultValue="World") String param1) {
		return new Helloworldclass("marco", "compagnoni");
	}
	
	@PostMapping("/hello")
		public Helloworldclass exampleMethod2(@RequestBody Helloworldclass body) {
			return body;
		}
	}
	

