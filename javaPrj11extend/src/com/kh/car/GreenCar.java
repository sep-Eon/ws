package com.kh.car;

public class GreenCar extends Car {

	public GreenCar(String color, int speed, int price) {
		super (color, speed, price);
	}
	
	public void sayGreen() {
		System.out.println("�׸�~~");
	}
	
	@Override
	public void startCar() {
		System.out.println("���� �õ�");
	}
	
	@Override
	public void stop() {
		System.out.println("������ �극��ũ~");
	}
	
	@Override
	public void go() {
		System.out.println("������ �Ǽ�");
	}

}
