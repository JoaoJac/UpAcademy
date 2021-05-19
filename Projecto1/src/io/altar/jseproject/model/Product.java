package io.altar.jseproject.model;

import java.util.ArrayList;
import java.util.List;

public class Product extends Entity_{
	private List<Long> shelfIdList= new ArrayList<>();
	private int discount;
	private int iva;
	private double price;
	
	public Product() {
		
	}
	
	public Product(int discount, int iva, double price) {
		this.discount = discount;
		this.iva = iva;
		this.price = price;
	}

	public Product(List<Long> shelfIdList, int discount, int iva, double price) {
		this.shelfIdList = shelfIdList;
		this.discount = discount;
		this.iva = iva;
		this.price = price;
	}
	
	public List<Long> getShelfList() {
		return shelfIdList;
	}
	public void setShelfList(List<Long> shelfList) {
		this.shelfIdList = shelfList;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [ID="+this.getId()+", shelfIdList=" + shelfIdList + ", discount=" + discount + ", iva=" + iva + ", price=" + price +"€"+"]";
	}
		
}
