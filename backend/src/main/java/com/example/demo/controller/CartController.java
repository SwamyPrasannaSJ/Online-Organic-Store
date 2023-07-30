package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CartDto;
import com.example.demo.model.CartModel;
import com.example.demo.service.CartService;

@RestController
public class CartController {
	@Autowired
	CartService service;
	
	@GetMapping("/cart")
	public List<CartModel> dataGet(){
		return service.getData();
	}
	
	@PostMapping("/cart")
	public String dataGet(@RequestBody CartDto model) {
		return service.addData(model);
	}
}
