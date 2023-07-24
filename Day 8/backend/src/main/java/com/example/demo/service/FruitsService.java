package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.FruitsDto;
import com.example.demo.model.FruitsModel;


public interface FruitsService {
	
	
	public String addData(FruitsDto fruits);
	public List<FruitsModel> getData();
	 

}
