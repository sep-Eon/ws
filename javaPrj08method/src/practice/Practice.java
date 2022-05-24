package practice;

public class Practice {
	
	public void test() {
		System.out.println("practice start~~");
//		printHelloWorld();
//		printMyName();
//		multiple(10);
//		System.out.println(getName());
		
		System.out.println(plus (10,5));
		
		System.out.println("practice end~~");
	}
	
	//hello world라고 출력하는 메소드 작성
	// 메소드 이름 : printHelloWorld
	
	
	public void printHelloWorld () {
		System.out.println("hello world!");
	}
	
	//printMyName
	/*
	 * 입력값 : x
	 * 반환값 : x
	 * 실행 내용 : 본인 이름 출력
	 */
	
	public void printMyName() {
		System.out.println("박상언");
	}
	
	//메소드명 :multiple
	//입력값 : 정수
	//반환값 :x
	//실행내용 : 입력받은 정수 *2
	
	//메소드명 : getName
	//입력값 : 없음
	//반환값 : 본인이름(심원용)
	//실행내용 : 없음 (반환만)
	
	public String getName() {
		return "박상언";
	}
	
	public void multiple (int x) {
		System.out.println(x*2);
	}
	
	public int plus (int x, int y) {
		System.out.println("메소드 호출됨");
		return x+y;
	}

}
