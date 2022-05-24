package com.kh.thread;

public class Main {
	
	public static final Factory factory = new Factory();

	public static void main(String[] args) {
		
//		System.out.println("==== 쓰레드 테스트 ====");
//		
//		//10초 카운트다운 하는 프로그램ㄴ
//		
//		for(int i = 10; i>0; i--) {
//			System.out.println(i);
//			//현재 쓰레드 가져와서, 그 쓰레드 1초 재우기
//			try {
//				Thread.currentThread().sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("예외 메세지 ::: " + e.getMessage()); //e에 담긴 예외타입을 표시
//			}
//		}
//		
//		System.out.println("땡~~");
		
//		test1();
		test2();
		
		
		
	}
	
		private static void test1() {
			
			System.out.println(" ==== inturrpt test ==== ");
			Thread t1 = new Thread (new MyRunner());
			t1.start();
			
			t1.interrupt();
			
		}
		
		private static void test2() {
			
			System.out.println(" ==== notify test ==== ");
			
			Thread t1 = new Thread(new RunnerMethodA());
			Thread t2 = new Thread(new RunnerMethodB());
			
			
			t1.start();
			t2.start();
		}

	

}
