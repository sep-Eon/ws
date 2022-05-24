package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("==== 예외 처리 ====");
		
		
//		System.out.println("안녕하세요");
//		try {
//			String str = null;
//			String strSub = str.substring(2, 5);
//			System.out.println(strSub);
//			int x = 1/0;
//			
//		}catch(ArithmeticException e) {
//			System.out.println("AE 잡음");
//			e.printStackTrace();
//		}catch(NullPointerException e) {
//		System.out.println("NPE 잡았음");}
//		
//		System.out.println("바이바이");
		
		Test t = new Test();
		
		try {
			t.methodA();
		} catch (Exception e) {
			System.out.println("메인 메소드에서 Exception catch");
			if (e instanceof MyException) {
				System.out.println("방금 잡은 예외는 MyException타입");
			}
		}
		
//		try {
//		throw new MyException();
//		} catch(Exception e) {
//			System.out.println("내가 만든 에러 잡음");
//		}
		
		
//		try {
//			t.test();
//		}catch(Exception e) {
//			System.out.println("메인메소드에서 Exception을 catch함");
//		}
		
		
	
	}

}
