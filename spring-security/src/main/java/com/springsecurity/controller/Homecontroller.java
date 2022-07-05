package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

//http://localhost:8080/all
	@GetMapping("/")
public String SayHello() {
    return "<h2> Hello !!!! </h2>";

    @GetMapping("/admin")	
	public String helloAdmin() {
    	return "<h2> Admin !!!! </h2>";
   
    @GetMapping("/User")
    public String hellouser() {
    	return "<h2>User !!!! <h2>";
    }
    
 }
	
	
