package com.GreetingSpring.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import modal.UserGreeting;



@RestController
@RequestMapping("/greeting")
public class Controller {
	
	@RequestMapping (value = {"/hellobl"})
	public String sayHelloBl() {
		return "Hello From Bridgelabz";
	}
	
	@RequestMapping(value = {"/query"}, method = RequestMethod.GET)
	public String sayHello(@RequestParam (value = "name") String name) {
		return "Hello" + name + " Complete Ur Home Work ";
			
	}
	
	@GetMapping ("/param/{name}")
	public String helloMsgParam(@PathVariable String name) {
		return "Hello " + name + " Join the Meeting ";
	}
	
	@PostMapping ("/post")
	public String helloMsg(@RequestBody UserGreeting user) {
		return "Hello " + user.getFirstName() + " " + user.getLastName();
	}
	
	@PutMapping ("/put/{fName}")
	public String hellomsg(@PathVariable String fName, @RequestParam (value = "lName" ) String lName ) {
		return "Hello " + fName + " " + lName ;
	}
}
