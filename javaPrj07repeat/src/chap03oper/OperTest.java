package chap03oper;

public class OperTest {
	
	//연산자
	
	/*
	 * 1.산술
	 * 2.비교
	 * 3.논리
	 */
	
	public void test() {
		//산술 연산자
		// +,-,*, /, %, =
		// 숫자 숫자 => 숫자
		// 1+1 => 2
		
		System.out.println(1+1);
	}
	
	public void test2() {
		//비교 연산자
		// >, <, >=, <=, ==, !=
		// 숫자 숫자 => 논리값 (T/F)
		// 1<9 => true
		
		System.out.println(1<2); // true
	}
	
	public void test3() {
		//논리 연산자
		// &&, ||, !(not, 부정 연산자)
		// 논리 논리 => 논리값 (T/F)
		// true && false => false
		
		System.out.println(true&&false);
		
	}
	
	public void test4() {
		//삼항 연산자
		// ? ;  (2가지)
		int x;
		x = 1 < 2 ? 100 : -99;
		// ?의 값이 true라면 콜론(:) 왼쪽 값 선택
		// ?의 값이 false 라면 콜론(:) 오른쪽 값 선택
		System.out.println(x);
		
		
	}
		
	
	}


