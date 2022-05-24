package com.kh.math;

public class MathTest {
	
	public void test() {
		//abs
		//숫자(정수,실수)의 절대값
		
		int num = -10;
		int result = Math.abs(num);
		System.out.println(result);
		System.out.println(num);
	}
	
	public void test2() {
		//ceil
		//실수를 올림
		
		double d = 1.23;
		double result = Math.ceil(d);
		System.out.println(result);
		
		//floor
		//실수를 내림
		double result2 = Math.floor(d);
		System.out.println(result2);
		
		//round
		//실수를 반올림
		double result3 = Math.round(d);
		System.out.println(result3);
		
	}
	
	public void test3() {
		//random
		//랜덤 (0~1사이의 double값)
		
		double r = Math.random();
		System.out.println(r);
	}

}
