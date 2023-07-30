package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class SellerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sellingType;
	private String name;
	private String img;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSellingType() {
		return sellingType;
	}
	public void setSellingType(String sellingType) {
		this.sellingType = sellingType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SellerModel(int id, String sellingType, String name, String img, int price) {
		super();
		this.id = id;
		this.sellingType = sellingType;
		this.name = name;
		this.img = img;
		this.price = price;
	}
	public SellerModel() {
		super();
		 
	}
	@Override
	public String toString() {
		return "SellerModel [id=" + id + ", sellingType=" + sellingType + ", name=" + name + ", img=" + img + ", price="
				+ price + "]";
	}
	
	

}
