	package com.naproject.demo.controller123.copy;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller123 {
@GetMapping("/")
	public String helloworld()
	{
		
		
		
		return "Hii Hleo namastha!!" ;
		
	}

}
