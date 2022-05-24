package com.kh.car;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====���====");
		
		Car rc = new RedCar("Red", 100, 3000); //RedCar�� �θ�Ŭ����(Car)�� �������
		rc.startCar();
		
		Car rc2 = new GreenCar("Green", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("Black", 300, 9900);
		rc3.startCar();
		
		rc.go();
		rc2.go();
		rc3.go();
		
//		��ü �� (instanceof)
//		
		// A instanceof B : A�� BŸ���� �´��� Ȯ���Ͽ�
		// boolean Ÿ���� �����͸� ����
//		if(rc instanceof Car) {
//			System.out.println("��������");
//		}
//		else {
//			System.out.println("�����ƴ�");
//		}
	}

}
