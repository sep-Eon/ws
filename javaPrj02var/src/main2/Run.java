package main2;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 변수 (정수형)
		 * 
		 * 1바이트 byte 256 : -128~ +127
		 * 2바이트 short 6553
		 * 4바이트 int 42억개
		 * 8바이트 long 많음
		 * 
		 * 왜 굳이 4개나 있을까? => 각 타입별로 나타낼 수 있는 범위 다름
		 */
		
		//a,b,c,d 라는 이름의 변수 4개 만들기
		//1,2,3,4 값 넣기
		//a,b,c,d 변수들 출력해보기
		
		byte a = 1;
		short b = 2;
		int c = 3;
		long d = 4;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		

	}

}
