package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

public class Product extends Entity_{
	private long id;
	private List<Long> shelfIdList= new ArrayList<>();
	private double discount;
	private int iva;
	private int price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Long> getShelfList() {
		return shelfIdList;
	}
	public void setShelfList(List<Long> shelfList) {
		this.shelfIdList = shelfList;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [shelfIdList=" + shelfIdList + ", discount=" + discount + ", iva=" + iva + ", price=" + price + "]";
	}
		
}
