package chap02var;

public class VarTest {
	
	/*
	 * 변수 명명 규칙
	 * - 클래스 이름은 대문자로 시작
	 * - 메소드 이름, 변수명은 소문자로 시작
	 * - 띄어쓰기가 있는 여러 단어의 경우, 띄어쓰기 대신 붙여쓰고 다음단어의 시작을 대문자로 변경
	 * - 상수변수 이름은 모두 대문자로 작성                          // ex) PI
	 * - 상수변수 이름이 여러개의 단어인 경우, '_' 를 사용한다. // ex) MAX_SIZE
	 * 
	 * -PascalCase // 대문자로 시작, 띄어쓰기 대신 대문자
	 * -camelCase // 소문자로 시작, 띄어쓰기 대신 대문자
	 * - 클래스 명은 PascalCase
	 * -메소드, 변수명은 camelCase
	 * 
	 */
	
	public void test() {
		
		int x = 10;
		
		System.out.println(x);
	}
	
	public void test2() {
		//정수형 변수
		
		byte b = 17; //1byte
		short s = 1; //2byte
		int i = 10; //4byte
		long l = 999; //8byte
		
		System.out.println("byte b : " + b);
		System.out.println("Short s : "+ s);
		System.out.println("int i : " + i);
		System.out.println("long l : " + l);
		
	}
	
	public void test3() {
		
		//실수형 변수
		
		float f = 3.14f; // 4byte
		double d = 1.234; // 8byte
		
		System.out.println("float f : " + f);
		System.out.println("double d : " + d);
	}
	
	public void test4() {
	
		//논리형 변수
		
		boolean b = false; // 1byte
		System.out.println(b);
		
	}
		
		
	public void test5() {
		
		char ch = 'A'; //2byte , A는 아스키코드 65
		System.out.println((int)'A'); //65로 출력
		// syso ((char)66); = B로 출력
		
		
	}
	
	// 컴퓨터는 문자를 숫자로 기억한다.
	

	
		
	public void test6() {
		String s = "String" ;
		System.out.println(s);
	}
	
	
	//상수 (==항상 같은 값을 가지는 수)
	public void test7 () {
		final double PI = 3.14;
		// 3.14를 이용하여 계산하는 프로그램 (원의 넓이)
//		pi = 3.41; //상수는 다시 값을 할당할 수 없음

	
	}
	}


