package com.kh.car;

public class GreenCar extends Car {

	public GreenCar(String color, int speed, int price) {
		super (color, speed, price);
	}
	
	public void sayGreen() {
		System.out.println("±×¸°~~");
	}
	
	@Override
	public void startCar() {
		System.out.println("³ìÂ÷ ½Ãµ¿");
	}
	
	@Override
	public void stop() {
		System.out.println("³ìÂ÷ÀÇ ºê·¹ÀÌÅ©~");
	}
	
	@Override
	public void go() {
		System.out.println("³ìÂ÷ÀÇ ¾Ç¼¿");
	}

}
