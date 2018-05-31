package com.sample.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Vidhya
 *
 */
@RestController
@RequestMapping("/rest/docker/hello")
public class HelloController {

	@GetMapping
	public String helloMethod() {
		return "Hello Docker";
	}

}
