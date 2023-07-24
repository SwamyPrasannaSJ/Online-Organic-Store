package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

 
import com.example.demo.dto.FruitsDto;
import com.example.demo.model.FruitsModel;
import com.example.demo.service.FruitsService;


@RestController
public class FruitsDisplayController {
	
	@Autowired
	FruitsService service;
	
	
	@CrossOrigin
	@GetMapping("/")
	public List<FruitsModel> getData() {
		return service.getData();
	}
	
	@PostMapping("/")
	public String getData(@RequestBody FruitsDto fruits) {
		return service.addData(fruits);
	}
	
	
}
