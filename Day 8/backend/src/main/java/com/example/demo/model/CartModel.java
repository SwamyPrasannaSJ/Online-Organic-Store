package com.example.demo.model;

 
import jakarta.persistence.Entity;
 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 
import lombok.Setter;

@Entity
@Setter

public class CartModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;

	private int quantity;

	private int price;

 

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public CartModel() {
		super();

	}

}
