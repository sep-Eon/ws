package main;

public class Test {
	
	public void test() throws Exception {
		
		//예외를 내가 직접 발생시키기
		
//		try {
//			throw new Exception(); //던진다. Exception 객체를
//		}catch(Exception e) {
//			System.out.println("예외 잡음");
//		}
		
		throw new Exception();
			
	}
	
	public void methodA() throws Exception {
		System.out.println("methodA 호출됨");
		try {
			methodB();
		}catch(Exception e) {
			throw new MyException();
		}
		System.out.println("methodA 종료");
	}
	
	public void methodB() throws Exception {
		System.out.println("methodB 호출됨");
		methodC();
		System.out.println("methodB 종료...");
	}
	
	public void methodC() throws Exception {
		System.out.println("methodC 호출됨");
		int x = 1/0;
		System.out.println("methodC 종료...");
		
	}

}
