package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SellersDto;
import com.example.demo.model.SellerModel;
import com.example.demo.service.SellersService;

@RestController

public class SellersController {
	
	@Autowired
	SellersService service;
	
	@CrossOrigin
	@GetMapping("/sellers")
	public List<SellerModel> getData(){
		return service.getData();
	}
	@CrossOrigin
	@PostMapping("/sellers")
	public String addData(@RequestBody SellersDto seller) {
		return service.addData(seller);
	}
	

}
