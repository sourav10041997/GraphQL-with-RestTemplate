package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class Demo2Service {
	private RestTemplate restTemplate;
	private String url = "http://localhost:8888/demo1";

	@Autowired
	public Demo2Service(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}
	public String returnDemo2From1() {
		String str = restTemplate.getForObject(url, String.class);
		return str.toString();
	}
}
