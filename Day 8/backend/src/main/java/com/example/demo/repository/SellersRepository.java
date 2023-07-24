package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SellerModel;
 

public interface SellersRepository  extends JpaRepository<SellerModel, Integer>{

}
