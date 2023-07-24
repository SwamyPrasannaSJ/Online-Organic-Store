package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SellersDto;
import com.example.demo.model.SellerModel;

public interface SellersService {
	
	
	public String addData(SellersDto  sellers);
	public List< SellerModel> getData();
}
