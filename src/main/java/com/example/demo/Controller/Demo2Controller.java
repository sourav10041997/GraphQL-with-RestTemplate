package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Demo2Service;

@RestController
public class Demo2Controller {
	@Autowired
	private Demo2Service service;

	@GetMapping("/demo1")
	public String getDemo1() {
		return "Hi from Demo 1 ,";
	}

	@QueryMapping("getDemo2")
	public String getDemo2() {
		return service.returnDemo2From1() + " Also Hi from Demo 2";
	}
}
