package io.altar.jseproject.model;

public class Shelf extends Entity_{
	private int capacity;
	private Product pr;
	private double dailyPrice;
	
	public Shelf() {
		
	}

	public Shelf(int capacity, double dailyPrice) {
		this.capacity = capacity;
		this.dailyPrice = dailyPrice;
	}
	
	public Shelf(int capacity, Product pr, double dailyPrice) {
		this.capacity = capacity;
		this.pr = pr;
		this.dailyPrice = dailyPrice;
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
		return "Shelf [ID="+this.getId()+", capacity=" + capacity + ", " + pr + ", dailyPrice=" + dailyPrice + "€" + "]";
	}
}
