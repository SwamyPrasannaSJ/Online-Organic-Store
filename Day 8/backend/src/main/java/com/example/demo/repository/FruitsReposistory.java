package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
 

import com.example.demo.model.FruitsModel;


public interface FruitsReposistory  extends JpaRepository<FruitsModel, Integer>{

}
