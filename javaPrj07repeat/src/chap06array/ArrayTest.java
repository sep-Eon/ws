package chap06array;

public class ArrayTest {
	
	//배열
	
	/*
	 * 1. 배열 변수 선언 : int[] a; // 타입[] 변수명; 
	 * 2. 배열 생성 : new int[3]; // new 타입[배열의 길이];
	 * 3. 배열 접근 // a[0]; // 변수명[인덱스];
	 * 
	 * <배열 초기화> // 배열을 생성하는 동시에 값을 할당
	 * new int[]{1,2,3,4,5,6} // new 타입[]{}
	 * {1,2,3,4,5}; 
	 * 
	 * 
	 * -배열의 index는 0부터 시작된다.
	 */
	public void test() {
		
		int []a ; //1.배열 선언
		a = new int [3]; //2. 배열 생성
	
		//3. 배열의 각 요소에 접근하기
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	
	}
	
	//다른 배열 타입 (double)
	public void test2() {
		
		double []doubleArray ;
		doubleArray = new double [3];
		
		doubleArray[0] = 1.111;
		doubleArray[1] = 2.222;
		doubleArray[2] = 3.333;
		
		System.out.println(doubleArray[0]);
		System.out.println(doubleArray[1]);
		System.out.println(doubleArray[2]);
	}	
	
	// 배열 (String타입)
	public void test3() {
		
		String[] strArr = new String[3];
		
		strArr[0]= "첫번째";
		strArr[1]= "두번째";
		strArr[2]= "세번째";
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		
		
	}
	}


