package com.srikanth.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.srikanth.rest_api.model.HelloWorldBean;

@RestController
public class HelloWorldController {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello world";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("HelloWorld");
	}
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean getPathDate(@PathVariable("name") String name){
		return new HelloWorldBean("Hello Word" + name);
	}
}
