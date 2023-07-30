package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SellersDto;
import com.example.demo.model.SellerModel;
import com.example.demo.repository.SellersRepository;
 

@Service
public class SellersServiceImp implements SellersService {
	
	
	@Autowired
	SellersRepository repo;
	
	 public String addData(SellersDto  seller) {
		
		 SellerModel model=new SellerModel();
		 BeanUtils.copyProperties(seller, model);
		 repo.save(model);
		return "Added";
	}

	@Override
	public List<SellerModel> getData() {
		
		return repo.findAll();
	}
}
