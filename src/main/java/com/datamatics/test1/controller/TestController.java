package com.datamatics.test1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {
	
	@GetMapping("/hr")
	public List<Hr> getHr(){
		List<Hr> hrList = new ArrayList<>();
		hrList.add(new Hr(1,"vijay", "pune", "101", "IT HR"));
		hrList.add(new Hr(2,"Ajay", "banglore", "102", "Mech HR"));
		
		return hrList;
	}

}
