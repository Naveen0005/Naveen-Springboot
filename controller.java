package com.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.enitity.College;
import com.spring.demo.servies.Servies01;

@RestController
public class controller {
	
	@Autowired
	private Servies01 servies;
	
	@RequestMapping ("/hello")
	public String getvalue() {
		return "<h1>i am naveen</h1>";
		
	}
	
	@PostMapping ("//savedata")
	public College insertdata(@RequestBody College clg) {
		return servies.insertdata(clg);
	}
	
	@GetMapping ("/getdata")
	public List<College> getAlldata(){
		return servies.getAlldata();
	}

	@DeleteMapping("/deletingrec/{id}")
	public void deleteData(@PathVariable("id") Long id)
	{
		 servies.delete(id);
	}
}
