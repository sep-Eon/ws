package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		// 배열(Array)
		
		/*
		 * 타입이 같은 변수를 여러개, 한 번에 만들 수 있음.
		 */
		
		//배열 생성
		int[] arr = new int[10]; //10개의 int
		
		arr[0] = 234;
		arr[1] = 4;
		arr[2] = 10;
		arr[3] = 20;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//배열 선언
		
		
		//타입[] 변수명;
		//타입 변수명[]; //띄어쓰기 상관x
		
		//int a[]; = int[] a;
		
		//배열 생성 및 할당
		
		int [] a = new int[3];
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		// int [] a = {1,2,3} 배열의 초기화 = 선언과 동시에 초기화(값 입력)
		// int [] a = new int[] {1,2,3}
		
		int [] a2 = {10,20,30,40,50}; // int [] a = new int[] {1,2,3}
		
		// int [] a = new int [5]
		// a[0] = 10;
		// a[1] = 20;
		// a[2] = 30;
		// a[3] = 40;
		// a[4] = 50;

		// 배열의 인덱스를 벗어나면, 에러가 발생함.
		
		
		// 배열에 접근하기
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
		// 배열 길이 체크
		
		// 배열.length
		
		System.out.println(a.length);
		
		// JVM = Java Virtual Machine, OS와 APP을 이어주는 것이 JVM이다. = 호환성 높음
		
		
		
		/*
		 * 1. 배열의 선언
		 * int[] a;
		 * int a[];
		 * int [] a;
		 * 
		 * 2.배열의 생성
		 * new int[3]
		 * 
		 * 3.배열의 각 요소(element)에 접근
		 * a[0]
		 */
		
		/*
		 * 
		 * 배열 초기화 (==선언과 동시에 값을 할당)
		 * int[] a = {1,2,3,};
		 * int[] a = new int[] {1,2,3};
		 */
		
		
		
		
		
		
		
		
		
		
		
	}

}
