package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.CartDto;
import com.example.demo.model.CartModel;

public interface CartService {

	public String addData(CartDto cart);
	public List<CartModel> getData();
	
}
