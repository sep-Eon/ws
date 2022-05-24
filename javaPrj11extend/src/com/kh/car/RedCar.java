package com.kh.car;

public class RedCar extends Car {
	
	public RedCar(String color, int speed, int price) {
		
		super (color, speed, price);
		// 부모 클래스의 생성자 (매개변수 3개)를 만들어냄
		//== 부모 클래스 생성
	}
	
	public void sayRed() {
		System.out.println("홍홍홍");
	}
	
	@Override
	public void startCar() {
		System.out.println("홍차 시동");
	}
	
	@Override
	public void stop() {
		System.out.println("홍차의 브레이크~");
	}
	
	@Override
	public void go() {
		System.out.println("홍차의 악셀");
	}

}
