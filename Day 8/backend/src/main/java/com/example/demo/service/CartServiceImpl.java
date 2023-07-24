package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CartDto;
import com.example.demo.model.CartModel;
import com.example.demo.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepository repo;

	public String addData(CartDto cart) {

		CartModel cartModel = new CartModel();
		BeanUtils.copyProperties(cart, cartModel);

		repo.save(cartModel);
		return "Added";
	}

	public List<CartModel> getData() {
		return repo.findAll();
	}
}
