package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FruitsDto {
	
	private String name;
	
	private String sellerName;
	
	private String img;
	
	private String category;
	
	private String type;
 
	private int price;

}
