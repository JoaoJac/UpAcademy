package io.altar.jseproject.model;

public class Shelf {
	private int id;
	private int capacity;
	private Product pr;
	private double dailyPrice;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public Product getPr() {
		return pr;
	}
	public void setPr(Product pr) {
		this.pr = pr;
	}
	public double getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}
	
	@Override
	public String toString() {
		return "Shelf [capacity=" + capacity + ", pr=" + pr + ", dailyPrice=" + dailyPrice + "]";
	}
}