package com.training;

public class UberEats {

	private String food;
	private long foodId;
	private String hotel;
	public UberEats() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UberEats(String food, long foodId, String hotel) {
		super();
		this.food = food;
		this.foodId = foodId;
		this.hotel = hotel;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public long getFoodId() {
		return foodId;
	}
	public void setFoodId(long foodId) {
		this.foodId = foodId;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	
}
