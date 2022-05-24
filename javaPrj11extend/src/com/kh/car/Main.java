package com.kh.car;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("====상속====");
		
		Car rc = new RedCar("Red", 100, 3000); //RedCar의 부모클래스(Car)를 만들어줌
		rc.startCar();
		
		Car rc2 = new GreenCar("Green", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("Black", 300, 9900);
		rc3.startCar();
		
		rc.go();
		rc2.go();
		rc3.go();
		
//		객체 비교 (instanceof)
//		
		// A instanceof B : A가 B타입이 맞는지 확인하여
		// boolean 타입의 데이터를 리턴
//		if(rc instanceof Car) {
//			System.out.println("ㅇㅇ맞음");
//		}
//		else {
//			System.out.println("ㄴㄴ아님");
//		}
	}

}
