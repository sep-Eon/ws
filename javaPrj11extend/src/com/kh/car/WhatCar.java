package com.kh.car;

public class WhatCar extends Car {

	public WhatCar(String color, int speed, int price) {
		super (color, speed, price);
	}
	
	
	public void sayWhat() {
		System.out.println("¹¹");
	}
	
	
	@Override
	public void startCar() {
		System.out.println("¿ÓÃ­ ½Ãµ¿");
	}
	
	@Override
	public void stop() {
		System.out.println("¿ÓÂ÷ÀÇ ºê·¹ÀÌÅ©~");
	}
	
	@Override
	public void go() {
		System.out.println("¿ÓÂ÷ÀÇ ¾Ç¼¿");
	}

}
