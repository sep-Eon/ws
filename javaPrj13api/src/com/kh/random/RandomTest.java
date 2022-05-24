package com.kh.random;

public class RandomTest {
	
	public void test() {
		
		//랜덤 숫자 뽑기
		java.util.Random r = new java.util.Random();
		//경로를 쓰면 임포트할 일 없음
		
		int randomInt = r.nextInt(5);
		System.out.println(randomInt);
		
		//nextInt
		//nextBoolean
		//nextFloat
		//nextDouble
		
	}

}
