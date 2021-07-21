package com.example.ProductCrud.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Products {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
    private String product_name;
    private float price;
    private String expiry_date;
    private float government_tax;
    private String promotions;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(Long id, String product_name, float price, String expiry_date, float government_tax,
			String promotions) {
		super();
		this.id = id;
		this.product_name = product_name;
		this.price = price;
		this.expiry_date = expiry_date;
		this.government_tax = government_tax;
		this.promotions = promotions;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public float getGovernment_tax() {
		return government_tax;
	}
	public void setGovernment_tax(float government_tax) {
		this.government_tax = government_tax;
	}
	public String getPromotions() {
		return promotions;
	}
	public void setPromotions(String promotions) {
		this.promotions = promotions;
	}
	
    
}
