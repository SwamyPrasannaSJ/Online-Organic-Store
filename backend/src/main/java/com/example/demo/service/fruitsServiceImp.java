package com.example.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FruitsDto;
import com.example.demo.model.FruitsModel;
import com.example.demo.repository.FruitsReposistory;

@Service
public  class fruitsServiceImp implements FruitsService {
	
	@Autowired
	FruitsReposistory repo;
	public String addData(FruitsDto fruits) {
		FruitsModel model=new FruitsModel();
		
		BeanUtils.copyProperties(fruits, model);
		
		repo.save(model);
		return "Added";
	}
	
	public List<FruitsModel> getData(){
		return repo.findAll();
	}
	

}
