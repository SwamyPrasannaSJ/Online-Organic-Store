package com.example.demo.model;

 
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
@Entity
public class FruitsModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private int  id;
 
	private String name;
	
	private String sellerName;
	
	private String img;
	
	private String category;
	
	
	private String type;
 
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public FruitsModel(int id, String name, String sellerName, String img, String category, String type, int price) {
		super();
		this.id = id;
		this.name = name;
		this.sellerName = sellerName;
		this.img = img;
		this.category = category;
		this.type = type;
		this.price = price;
	}

	public FruitsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FruitsModel [id=" + id + ", name=" + name + ", sellerName=" + sellerName + ", img=" + img
				+ ", category=" + category + ", type=" + type + ", price=" + price + "]";
	}
	 
 

 
	
	
}