package com.kh.car;

public abstract class Car {

	public Car() {
		
	}
	
	public Car(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	private String color = "부모색상";
	private int speed = -1;
	private int price = -1;
	
	
	
	public abstract void startCar();
	
	public abstract void stop();
	public abstract void go();
	
	
	
	
	
	
	public String getColor() {
		System.out.print("Car Class getter called...");
		return this.color;
	}
	
	public int getSpeed() {
		System.out.print("Car Class getter called...");
		return this.speed;
	}
	
	public int getPrice() {
		System.out.print("Car Class getter called...");
		return this.price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setPricd (int price) {
		this.price = price;
	}
}
