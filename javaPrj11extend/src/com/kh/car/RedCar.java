package com.kh.car;

public class RedCar extends Car {
	
	public RedCar(String color, int speed, int price) {
		
		super (color, speed, price);
		// �θ� Ŭ������ ������ (�Ű����� 3��)�� ����
		//== �θ� Ŭ���� ����
	}
	
	public void sayRed() {
		System.out.println("ȫȫȫ");
	}
	
	@Override
	public void startCar() {
		System.out.println("ȫ�� �õ�");
	}
	
	@Override
	public void stop() {
		System.out.println("ȫ���� �극��ũ~");
	}
	
	@Override
	public void go() {
		System.out.println("ȫ���� �Ǽ�");
	}

}
