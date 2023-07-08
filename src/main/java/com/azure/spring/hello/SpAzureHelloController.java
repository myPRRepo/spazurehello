package com.azure.spring.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpAzureHelloController {

	 @GetMapping("/helloazure")
	 public String sayHello(){
		 return "My name is Azure";
	 }
}
