package chap05loop;

public class LoopTest {
	
	//반복문
	
	/*
	 * for
	 * while
	 * for -while
	 *  
	 * break : 현재 반복문 탈출
	 * continue : 현재 반복문 처음으로 이동
	 * 
	 */
	
	// for
	// n번 "hello world" 출력
	public void test() {
		
		int n = 3;
		
		for (int i = 0; i < n ; ++i) { //초기식, 조건식, 증감식
			System.out.println("Hello World");
		}
	}

	// n번 "hello world" 출력
	public void test2() {
		
	int n = 5;
	int i = 0;
	
	while (i<n) {
		System.out.println("Hello World");
		++i;		
	}
	}
	
	
	//do-while
	//n번 hello world출력
	public void test3() {
		
		int n = 7;
		int i = 0;
		
		do { //증감식
		System.out.println("Hello World");
		++i;
		}while(i<n); //조건식
		
	}
	

}
